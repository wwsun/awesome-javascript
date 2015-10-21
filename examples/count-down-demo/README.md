# DEMO: Countdown Clock

Requirements:

- Set a valid end date.
- Calculate the time remaining.
- Convert the time to a usable format.
- Output the clock data as a reusable object.
- Display the clock on the page, and stop the clock when it reaches zero.

The tutorial of this repo is from [a post of sitepoint.com](http://www.sitepoint.com/build-javascript-countdown-timer-no-dependencies/).

## Date format

1. ISO 8601 format: `2015-12-31`
1. Short format: `31/12/2015`
1. Long format: `December 31 2015`

more about date formatting in JavaScript in this [article](https://msdn.microsoft.com/library/ff743760).

## Calculate the time remaining

    function getTimeRemaining(endtime){
      var t = Date.parse(endtime) - Date.parse(new Date());
      var seconds = Math.floor( (t/1000) % 60 );
      var minutes = Math.floor( (t/1000/60) % 60 );
      var hours = Math.floor( (t/(1000*60*60)) % 24 );
      var days = Math.floor( t/(1000*60*60*24) );
      return {
        'total': t,
        'days': days,
        'hours': hours,
        'minutes': minutes,
        'seconds': seconds
      };
    }
    
## Further

1. Schedule the clock automatically
1. Count down from when the user arrives
1. Maintain clock progress across pages