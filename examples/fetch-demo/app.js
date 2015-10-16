/**
 * 包装Fetch API，用于向指定URL发起请求
 * @param url 请求的URL
 * @returns {Promise.<T>}
 */
function wrapperOnFetch(url) {
  let headers = new Headers();
  headers.append('Accept', 'application/vnd.github.v3+json');
  let request = new Request(url, {headers: headers});

  return fetch(request).then(res => res.json());
}

/**
 * 从Github获取信息
 * @param orgNames 组织名
 */
function *githubDetails(orgNames) {
  let baseUrl = 'https://api.github.com/orgs/';
  let url = baseUrl + orgNames;

  let reposUrl = yield wrapperOnFetch(url);
  let repoFullName = yield wrapperOnFetch(reposUrl);
  yield wrapperOnFetch(`https://api.github.com/repos/${repoFullName}/contributors`);
}

// running

var generator = githubDetails('aspnet');

generator.next().value.then(function (userData) {
  document.querySelector("#avatar").src = userData.avatar_url;
  document.querySelector("#login").textContent = userData.login;
  document.querySelector("#login").href = userData.html_url;
  document.querySelector("#repoCount").textContent = userData.public_repos;

  return generator.next(userData.repos_url).value.then(function (reposData) {
    return reposData;
  });
}).then(function (reposData) {
  var randomIndex = Math.round(Math.random() * 100) % reposData.length;
  var link = `<a href="https://"github.com/${reposData[randomIndex].full_name}">${reposData[randomIndex].name}</a>`;

  document.querySelector("#repoName").innerHTML = link;
  document.querySelector("#repoDescription").textContent = reposData[randomIndex].description;
  return generator.next(reposData[randomIndex].full_name).value.then(function (selectedRepoCommits) {
    var tiles = "";
    selectedRepoCommits.forEach(function (contributor) {
      var tile = `<div class="col-md-3 tile">
        <div class="col-md-8">
        <img src="${contributor.avatar_url}" alt="${contributor.login}" class="avatar">
        </div>
        <div class="col-md-4">
        <a href="${contributor.html_url}">${contributor.login}</a>
        <br>
        <a href="${contributor.html_url}?tab=repositories">Repos</a>
        </div>
        </div>`;
      tiles += tile;
    });

    document.querySelector("#contributors").innerHTML = tiles;
    return selectedRepoCommits;
  });
});