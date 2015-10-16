/**
 * 包装Fetch API，用于向指定URL发起请求
 * @param url 请求的URL
 * @returns {Promise.<T>}
 */
'use strict';

var marked0$0 = [githubDetails].map(regeneratorRuntime.mark);
function wrapperOnFetch(url) {
  var headers = new Headers();
  headers.append('Accept', 'application/vnd.github.v3+json');
  var request = new Request(url, { headers: headers });

  return fetch(request).then(function (res) {
    return res.json();
  });
}

/**
 * 从Github获取信息
 * @param orgNames 组织名
 */
function githubDetails(orgNames) {
  var baseUrl, url, reposUrl, repoFullName;
  return regeneratorRuntime.wrap(function githubDetails$(context$1$0) {
    while (1) switch (context$1$0.prev = context$1$0.next) {
      case 0:
        baseUrl = 'https://api.github.com/orgs/';
        url = baseUrl + orgNames;
        context$1$0.next = 4;
        return wrapperOnFetch(url);

      case 4:
        reposUrl = context$1$0.sent;
        context$1$0.next = 7;
        return wrapperOnFetch(reposUrl);

      case 7:
        repoFullName = context$1$0.sent;
        context$1$0.next = 10;
        return wrapperOnFetch('https://api.github.com/repos/' + repoFullName + '/contributors');

      case 10:
      case 'end':
        return context$1$0.stop();
    }
  }, marked0$0[0], this);
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
  var link = '<a href="https://"github.com/' + reposData[randomIndex].full_name + '">' + reposData[randomIndex].name + '</a>';

  document.querySelector("#repoName").innerHTML = link;
  document.querySelector("#repoDescription").textContent = reposData[randomIndex].description;
  return generator.next(reposData[randomIndex].full_name).value.then(function (selectedRepoCommits) {
    var tiles = "";
    selectedRepoCommits.forEach(function (contributor) {
      var tile = '<div class="col-md-3 tile">\n        <div class="col-md-8">\n        <img src="' + contributor.avatar_url + '" alt="' + contributor.login + '" class="avatar">\n        </div>\n        <div class="col-md-4">\n        <a href="' + contributor.html_url + '">' + contributor.login + '</a>\n        <br>\n        <a href="' + contributor.html_url + '?tab=repositories">Repos</a>\n        </div>\n        </div>';
      tiles += tile;
    });

    document.querySelector("#contributors").innerHTML = tiles;
    return selectedRepoCommits;
  });
});