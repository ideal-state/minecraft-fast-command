# Minecraft Fast Command

![Gradle](https://img.shields.io/badge/Gradle-v8%2E5-g?logo=gradle&style=flat-square)
![Zulu JDK](https://img.shields.io/badge/Zulu%20JDK-8-blue?style=flat-square)
![GitHub License](https://img.shields.io/github/license/ideal-state/minecraft-fast-command?style=flat-square)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/ideal-state/minecraft-fast-command?style=flat-square&logo=github)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/ideal-state/minecraft-fast-command/release.yml?style=flat-square)
![GitHub Release](https://img.shields.io/github/v/release/ideal-state/minecraft-fast-command?style=flat-square)
![Discord](https://img.shields.io/discord/1191122625389396098?style=flat-square&logo=discord)

------------------------------------------------------

> 提供基于 `hyper-command` 的 `bukkit` 命令系统组件包

### 在 Maven 项目中使用

```xml

<dependency>
    <groupId>team.idealstate.minecraft</groupId>
    <artifactId>minecraft-fast-command-spigot</artifactId>
    <version>${version}</version>
</dependency>
```

### 在 Gradle 项目中使用

```groovy
dependencies {
    implementation "team.idealstate.minecraft:minecraft-fast-command-spigot:${version}"
}
```

```kotlin
dependencies {
    implementation("team.idealstate.minecraft:minecraft-fast-command-spigot:${version}")
}
```

### 在哪下载 ?

> 前往 [releases](https://github.com/ideal-state/minecraft-fast-command/releases) 页

### 如何构建

```shell
git clone https://github.com/ideal-state/minecraft-fast-command.git
```

```shell
cd ./minecraft-fast-command
```

```shell
./gradlew.bat :clean :minecraft-fast-command-spigot:jar
```

或

```shell
./gradlew :clean :minecraft-fast-command-spigot:jar
```

> 等待构建完成，在 ./build/libs 下会生成 .jar 工件

### 关于开发配置

> [`local.properties`](./local.properties)

### 怎样成为贡献者 ?

在贡献之前，你需要了解相应的规范。[前往查看](https://github.com/ideal-state)

