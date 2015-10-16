var gulp = require('gulp');
var babel = require('gulp-babel');

gulp.task('babel', function () {
  return gulp.src(['app.js'])
    .pipe(babel())
    .pipe(gulp.dest('es5'));
});

gulp.task('watch', function () {
  return gulp.watch('app.js', ['babel']);
});

gulp.task('default', ['babel', 'watch']);