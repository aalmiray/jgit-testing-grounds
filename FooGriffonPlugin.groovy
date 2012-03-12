class FooGriffonPlugin {
    String version = '0.2'
    String griffonVersion = '0.9.5 > *'
    Map dependsOn = [:]
    List pluginIncludes = []
    List toolkits = []
    List platforms = []
    String license = 'secret'
    String documentation = ''
    String source = ''

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'your@foo.com'
        ]
    ]
    String title = 'Foo Bar'
    String description = '''
Foo
'''
}
