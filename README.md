# 🥚 Yolked

```
__     ______  _    _   _      ____   _____ ______ 
\ \   / / __ \| |  | | | |    / __ \ / ____|  ____|
 \ \_/ / |  | | |  | | | |   | |  | | (___ | |__   
  \   /| |  | | |  | | | |   | |  | |\___ \|  __|  
   | | | |__| | |__| | | |___| |__| |____) | |____ 
   |_|  \____/ \____/  |______\____/|_____/|______|                                                  
```
           🥚 Useless Egg Incubator 🥚

## 📖 Overview

Welcome to **Yolked**! A delightfully absurd virtual egg incubator written in Java.

## ✨ Features

- 🐣 **Create Multiple Eggs** - Start an incubation with as many eggs as you want
- 🌡️ **Heat Management** - Watch as temperature fluctuates randomly around your eggs
- 📊 **Progress Tracking** - Monitor each egg's development from 0 to 100%
- 😊 **Mood System** - Eggs have moods that change based on their conditions
- 🎭 **Fun Names** - Every egg gets a randomly generated fun name
- ♻️ **Continuous Cycles** - Eggs cycle through hatching and the process repeats

## 🛠️ Project Structure

```
src/
├── Main.java           # Entry point and welcome screen
├── Egg.java           # Egg class with properties (progress, heat, mood)
└── EggIncubator.java  # Core incubator logic and egg management
```

## 📝 How It Works

1. **Start the Program** - Run Main.java
2. **Create Eggs** - Enter the number of eggs you want to incubate
3. **Watch the Magic** - The incubator automatically manages each egg:
   - Progress increases to 100%, then decreases back to 0
   - Heat fluctuates randomly (0-100)
   - Mood changes based on egg conditions
   - Fake hatching occurs when eggs reach 100% progress

## 🎮 Gameplay Loop

```
Every 120ms for each egg:
  ├─ Update progress (increase/decrease)
  ├─ Update heat (random fluctuation)
  ├─ Update mood (based on conditions)
  └─ Check for fake hatch event
```

## 🎯 Project Goals

This is a playful, intentionally useless project designed to:
- ✅ Demonstrate Java fundamentals
- ✅ Practice object-oriented design
- ✅ Have fun with absurd concepts
- ✅ Learn about continuous loops and state management

---

**Made with 🥚 and questionable decision-making**
