module.exports = {
    entry: './index.jsx',
    output: {
        //filename: 'bundle.js', // by default
        publicPath: 'http://localhost:8090/assets' // bundle.js will be here
    },
    module: {
        loaders: [
            {
                // tell webpack to user jsx-loader for all *.jsx files
                test: /\.jsx$/,
                loader: 'jsx-loader?insertPragma=React.DOM&harmony'
            }
        ]
    },
    externals: {

        // don't bundle the 'react' npm package with our bundle.js
        // but get it from a global 'React' variable
        'react': 'React'
    },
    resolve: {
        extensions: ['', '.js', '.jsx']
    }
};