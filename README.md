[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/license/gpl-3-0/)

# All The Horrors Core

**A minecraft mod with miscellaneous features created for the [All The Horrors](https://github.com/emmaexe/all-the-horrors) modpack.**

## Features

### Aquamirae anglerfish modifier

Changes how the anglerfish from [aquamirae](https://modrinth.com/mod/aquamirae) spawns, allowing it to spawn in all ocean and river biomes, not just aquamirae's biomes.

### Gravestones modifier

All The Horrors uses the [GraveStone Mod](https://modrinth.com/mod/gravestone-mod) and this mod modifies its behaviour, allowing some items to be dropped onto the ground instead of being stored in the grave after death. The chance for any item to drop will be modifiable later on, but for now it is set to 30%.

### Dependency checker

The All The Horrors modpack recommends using the [Cave Dweller Sound Overhaul](https://legacy.curseforge.com/minecraft/texture-packs/cave-dweller-sound-overhaul) resource pack, but it can't be included by default due to licencing issues. This feature shows a prompt to the user when they start the game giving them the option to download the pack themselves.

## Compile

This project requires Java 17.

Clone the project:

```bash
  git clone https://github.com/emmaexe/all-the-horrors-core
  cd all-the-horrors-core
```

You can compile the project using the following command:

```bash
  ./gradlew build
```

The built mod should be located under ``./build/libs/``

## Feedback and support

If you need support or have any feedback, you can open a pull request or issue on the [github page](https://github.com/emmaexe/all-the-horrors-core/issues), or join the [discord](https://ln.emmaexe.moe/discord-server) or [matrix (WIP)](https://ln.emmaexe.moe/matrix-server) servers.

## Authors

- [@emmaexe](https://www.emmaexe.moe/)
