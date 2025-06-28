
plugins {
    id("com.gtnewhorizons.gtnhconvention")
}

dependencies {
    // Example: for StringUtils, Validate, etc.
    implementation("org.apache.commons:commons-lang3:3.4")

    // Example: for FileUtils, IOUtils, etc.
    implementation("commons-io:commons-io:2.4")

    // Example: for Apache HTTP client
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
}