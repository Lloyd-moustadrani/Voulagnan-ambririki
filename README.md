# 🎯 Voulagnan - Application Android de Communication

Voulagnan est une application Android moderne et fonctionnelle conçue pour faciliter les conversations et interactions en temps réel. L'application propose une interface élégante avec navigation fluide entre plusieurs écrans.

## ✨ Fonctionnalités Principales

- 🏠 **Écran d'accueil** - Interface principale avec navigation intuitive
- 💬 **Chat en temps réel** - Module de messagerie avec réponses automatiques
- 🗣️ **Conversation** - Écran dédié aux conversations classiques
- 🎨 **Design Modern** - Interface Material Design réactif
- ⌨️ **Navigation fluide** - Transitions smooth entre les écrans
- 🔐 **Licence propriétaire** - Protection complète du code source

## 📱 Structure du Projet

```
Voulagnan-ambириiki/
├── app/
│   ├── src/main/
│   │   ├── java/com/voulagnan/
│   │   │   ├── MainActivity.kt         # Écran d'accueil
│   │   │   ├── ChatActivity.kt         # Écran de chat
│   │   │   ├── ConversationActivity.kt # Écran de conversation
│   │   │   └── Message.kt              # Modèle de données
│   │   ├── res/
│   │   │   ├── drawable/
│   │   │   │   └── ic_app.xml          # Logo de l'app
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   ├── activity_chat.xml
│   │   │   │   └── activity_conversation.xml
│   │   │   └── values/
│   │   │       ├── colors.xml          # Palette de couleurs
│   │   │       ├── strings.xml          # Chaînes de texte
│   │   │       └── styles.xml           # Thèmes personnalisés
│   │   └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
├── LICENSE
└── README.md
```

## 🛠️ Configuration Requise

| Composant | Version |
|-----------|---------|
| Android Studio | 2022.1+ |
| SDK Android | API 21 - 33 |
| Java / Kotlin | 1.8+ |
| Gradle | 7.0+ |

## 📦 Dépendances

- **androidx.appcompat** v1.6.1 - Support AppCompat
- **com.google.android.material** v1.9.0 - Material Design
- **androidx.constraintlayout** v2.1.4 - ConstraintLayout
- **junit** v4.13.2 - Tests unitaires
- **androidx.test.espresso** v3.5.1 - Tests UI

## 🚀 Installation et Démarrage

### 1. Cloner le dépôt
```bash
git clone https://github.com/Lloyd-moustadrani/Voulagnan-ambириiki.git
cd Voulagnan-ambириiki
```

### 2. Ouvrir dans Android Studio
- Lancer Android Studio
- Sélectionner **"Open an existing Android Studio project"**
- Naviguer vers le dossier cloné

### 3. Compiler et Exécuter
```bash
# Via Android Studio
- Cliquer sur "Run" (Shift + F10)
# Via terminal
./gradlew build          # Compiler
./gradlew installDebug   # Installer sur émulateur/appareils
```

## 📱 Guide de l'Utilisateur

### Écran Principal (MainActivity)
- Affichage du logo et titre Voulagnan
- Deux boutons principaux de navigation:
  - **Conversation** - Accède au module de conversation
  - **Chat** - Accède au module de messagerie

### Écran Chat (ChatActivity)
- Zone de messages scrollable
- Champ de saisie avec bouton "Envoyer"
- Réponse automatique du bot après 500ms
- Support du clavier (Entrée pour envoyer)

### Écran Conversation (ConversationActivity)
- Interface de conversation basique
- Bouton de retour vers l'accueil
- Extensible pour ajouter de la logique personnalisée

## 🎨 Thème et Couleurs

| Élément | Couleur | Code |
|---------|---------|------|
| Primaire | Violet | #6200EE |
| Secondaire | Turquoise | #03DAC6 |
| Fond | Blanc | #FFFFFF |
| Texte | Noir | #000000 |
| Erreur | Rouge | #B3261E |

## 🔧 Capacités Intégrées

- ✓ Gestion complète des messages
- ✓ Affichage dynamique en temps réel
- ✓ Système de navigation intelligente
- ✓ Permissions: INTERNET, RECORD_AUDIO
- ✓ Support RTL (Right-to-Left)
- ✓ ProGuard pour optimisation release

## 🔐 Licence

**LICENCE PROPRIÉTAIRE** - Tous droits réservés à Lloyd Moustadrani

Seules les personnes explicitement autorisées par écrit peuvent:
- Modifier le code
- Copier le logiciel
- Publier des versions
- Mettre à jour l'application

Voir le fichier [LICENSE](LICENSE) pour détails complets.

## 📝 Développement

### Architecture
- **Pattern**: Activities + Layouts XML
- **Langage**: Kotlin
- **Threading**: Main + Coroutines-ready

### Améliorations Futures
- [ ] Système d'authentification Firebase
- [ ] Base de données Room pour persistance
- [ ] Notifications push FCM
- [ ] Partage de fichiers
- [ ] Localisation multilingue
- [ ] Mode hors ligne

## 🐛 Signaler des Bugs

Créez une issue sur GitHub avec:
- Description détaillée
- Étapes de reproduction
- Logs d'erreur (Logcat)
- Appareil et version Android

## 👤 Auteur

**Lloyd Moustadrani**
- GitHub: [@Lloyd-moustadrani](https://github.com/Lloyd-moustadrani)
- Dépôt: [Voulagnan-ambириiki](https://github.com/Lloyd-moustadrani/Voulagnan-ambириiki)

## 📊 Statistiques du Projet

- **Langage**: Kotlin (100%)
- **Fichiers Kotlin**: 4
- **Fichiers XML**: 6
- **API Minimale**: 21
- **API Cible**: 33
- **Version**: 1.0
- **État**: Production-ready ✓

## 📞 Support

Pour toute question ou besoin d'assistance:
1. Consultez la documentation
2. Créez une issue GitHub
3. Contactez directement l'auteur

## 🤝 Contribution

Les contributions sont **restreintes** selon la licence propriétaire.
Seules les personnes autorisées peuvent soumettre des modifications.

---

**Voulagnan v1.0** | Développé avec ❤️ pour Android | 2024 © Lloyd Moustadrani
