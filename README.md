# codelens-intellij-plugin

[WIP - Work In Progress]

![Build](https://github.com/nworkzdev/codelens-intellij-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)

<!-- Plugin description -->
## Description:

CodeLens is a visual debugging tool designed to help developers understand the execution flow of their Java code. It works by intercepting method calls at runtime and then visualizing those calls as a graph. This graph shows which methods were called, in what order, and how long they took to execute. In addition to tracking method calls, CodeLens also keeps track of the values of variables and arguments throughout the entire call chain.

## Purpose:

The primary purpose of CodeLens is to make debugging and code analysis easier and more intuitive. Instead of stepping through code line by line in a traditional debugger, developers can use CodeLens to:

* **Quickly grasp the overall structure of a program's execution.** See the big picture of how methods interact.

* **Identify performance bottlenecks.** Spot methods that are called frequently or take a long time to execute.

* **Understand complex codebases.** Visualize the call flow in unfamiliar or complicated code.

* **Debug more efficiently.** Pinpoint the source of a bug by seeing the exact sequence of method calls and how variable values change.

* **Track variable changes:** See how the values of arguments change throughout the method call chain.
<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "codelens-intellij-plugin"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/nworkzdev/codelens-intellij-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
