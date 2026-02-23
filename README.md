# Spotify 2026

Java application that simulates a music platform, built following Clean Architecture principles.

## Architecture

The project is structured in 3 layers:

- **Domain** - Models, repository interfaces and use cases. No external dependencies.
- **Data** - Repository implementations and data sources (in-memory, API).
- **Presentation** - Views that consume use cases and display results.

Each feature (songs, albums, authors) follows this same structure independently.

## Design Patterns

- **Repository Pattern** - Abstracts data access behind interfaces defined in the domain layer.
- **Singleton Pattern** - Ensures a single shared instance of in-memory data sources.

## Features

- [x] Songs
- [x] Albums
- [x] Authors

## Tech Stack

- Java
- Gradle (Kotlin DSL)

## Exercises

- [x] Exercise 01 - Get albums list
- [x] Exercise 02 - Save author in local
- [ ] Exercise 03 - Get authors from API using Retrofit
- [x] Exercise 04a - Singleton pattern in Songs feature
- [x] Exercise 04b - Singleton pattern in Authors feature
- [x] Exercise 05a - SaveSongUseCase
- [x] Exercise 05b - SaveAuthorUseCase
- [x] Exercise 06a - DeleteSongUseCase
- [x] Exercise 06b - DeleteAuthorUseCase
- [x] Exercise 06c - DeleteAlbumUseCase
