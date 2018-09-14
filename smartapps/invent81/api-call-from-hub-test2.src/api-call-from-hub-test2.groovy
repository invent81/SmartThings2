/**
 *  api_call_from_hub_test2
 *
 *  Copyright 2018 Brent Miller
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
 
def myCommand() {
    def result = new physicalgraph.device.HubAction(
        method: "GET",
        path: "http://192.168.3.25/cgi-bin/bluelava/bluelava.cgi?action=off&device=a6",
        headers: [
            HOST: getHostAddress()
        ]
    )
    return result
}



//http://192.168.3.25/cgi-bin/bluelava/bluelava.cgi?action=off&device=a6