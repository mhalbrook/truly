# clojure-test

FIXME: description

## Repo URL

git clone https://github.com/mhalbrook/truly.git

## Usage

### Description
Clojure service that returns a json object containing a message that is dynamically set by teh MESSAGE system environment variable.

### Building
To build the application with docker, run:
            docker build -t [tag] .

To build the application locally, run:
            lein run


### Running the application
To run the docker container, run:
            docker run -e MESSAGE=[message]-dp [port]:8080 [tag]
where [message] is the string that you would like returned in the json object response and [tag] is the tag set in the docker build step.





## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2022 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
