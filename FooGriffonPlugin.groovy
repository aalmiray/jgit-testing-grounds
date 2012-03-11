class FooGriffonPlugin {
    String version = '0.1'
    String griffonVersion = '0.9.5 > *'
    Map dependsOn = [:]
    List pluginIncludes = []
    List toolkits = []
    List platforms = []
    String license = '<UNKNOWN>'
    String documentation = ''
    String source = ''

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'your@email.com'
        ]
    ]
    String title = 'Plugin summary/headline'
    String description = '''
Brief description of Foo.

Usage
----
Lorem ipsum

Configuration
-------------
Lorem ipsum
'''
}
