load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "Child",
    srcs = ["Child.java"],
    main_class = "src.main.java.com.example.nested.Child",
    deps = ["//:greeter"]
)
