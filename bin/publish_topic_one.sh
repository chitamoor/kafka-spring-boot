#!/usr/bin/env bash
curl -d '{"integerAttribtuteOne":"123", "stringAttribtuteTwo":"value_for_stringAttribtuteTwo"}' -H "Content-Type: application/json" -X POST http://localhost:9000/kafka/publish
