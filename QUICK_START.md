# ⚡ QUICK START - Voulagnan en 5 Minutes

## 1️⃣ Cloner le Projet
```bash
git clone https://github.com/Lloyd-moustadrani/Voulagnan-ambiriiki.git
cd Voulagnan-ambiriiki
```

## 2️⃣ Ouvrir dans Android Studio
- Fichier → Ouvrir un projet Android Studio existant
- Sélectionner le dossier `Voulagnan-ambiriiki`
- **Attendre la synchronisation Gradle** (très important!)

## 3️⃣ Compiler
```bash
# Terminal (dans le dossier du projet)
./gradlew build

# Ou dans Android Studio
Build → Make Project (Ctrl+F9)
```

## 4️⃣ Exécuter
### Sur Émulateur
1. Tools → Device Manager
2. Créer un nouveau AVD (Android 7.0+)
3. Lancer l'émulateur
4. Run → Run 'app' (Shift+F10)

### Sur Téléphone
1. Connecter le téléphone en USB
2. Activer le mode développeur
3. Autoriser le débogage USB
4. Run → Run 'app' (Shift + F10)

## 5️⃣ Utiliser l'App

### Écran Principal
- Logo Voulagnan au centre
- 2 boutons: **Conversation** et **Chat**

### Chat
- Tapez un message
- Cliquez "Envoyer" ou appuyez sur Entrée
- Le bot répond automatiquement!

### Conversation
- Écran basique pour futures fonctionnalités

## 🔧 Dépannage Rapide

| Problème | Solution |
|----------|----------|
| "SDK not found" | Installer API 33 via SDK Manager |
| Build échoue | Faire `./gradlew clean build` |
| Pas d'appareil | Lancer un émulateur (Device Manager) |
| APK lente à installer | C'est normal, première installation |

## 📦 Fichiers Importants

```
Voulagnan-ambiriiki/
├── app/src/main/
│   ├── java/com/voulagnan/
│   │   ├── MainActivity.kt      ← Écran d'accueil
│   │   ├── ChatActivity.kt      ← Chat avec messages
│   │   └── ConversationActivity.kt
│   └── res/
│       ├── layout/              ← Interfaces UI
│       └── values/              ← Couleurs, textes
├── build.gradle                 ← Configuration
└── README.md                    ← Documentation complète
```

## 🚀 Prochaines Étapes

- Modifier `ChatActivity.kt` pour logique personnalisée
- Ajouter une base de données Room
- Intégrer Firebase pour authentication
- Publier sur Google Play Store

---
**Besoin d'aide?** Voir `BUILD_AND_RUN.md` pour guide complet
