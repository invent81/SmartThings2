def myCommand() {
    def result = new physicalgraph.device.HubAction(
        method: "GET",
        path: "/yourpath?param1=value1&param2=value2",
        headers: [
            HOST: getHostAddress()
        ]
    )
    return result
}