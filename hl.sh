#!/bin/sh

pbpaste | highlight --syntax=clojure -O rtf | pbcopy
