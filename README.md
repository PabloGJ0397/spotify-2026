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

- [ ] Songs
- [ ] Albums
- [ ] Authors

## Tech Stack

- Java
- Gradle (Kotlin DSL)