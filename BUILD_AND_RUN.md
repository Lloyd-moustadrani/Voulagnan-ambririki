# 🚀 GUIDE COMPLET - COMPILER ET EXÉCUTER VOULAGNAN

## 📋 Prérequis Essentiels

Avant de compiler l'application, assurez-vous d'avoir:

1. **Android Studio** (Version 2022.1 ou plus récente)
   - Télécharger: https://developer.android.com/studio
   
2. **Android SDK** (API 33 ou plus)
   - API 21 (Android 5.0) minimum requis
   - Télécharger via Android Studio → Settings → SDK Manager
   
3. **Java JDK** (Version 1.8 ou plus)
   - Télécharger: https://www.oracle.com/java/technologies/downloads/
   - Vérifier: `java -version`

4. **Gradle** (Version 7.0 ou plus)
   - Inclus dans Android Studio
   - Ou installer séparément: https://gradle.org/install/

## 💻 Installation Étape par Étape

### Étape 1: Cloner le Dépôt
```bash
git clone https://github.com/Lloyd-moustadrani/Voulagnan-ambiriiki.git
cd Voulagnan-ambiriiki
```

### Étape 2: Configurer Android Studio

1. Ouvrir **Android Studio**
2. Sélectionner **"Open an existing Android Studio project"**
3. Naviguer vers le dossier `Voulagnan-ambiriiki` cloné
4. Attendre la synchronisation Gradle (peut prendre 2-5 minutes)

### Étape 3: Vérifier l'Installation

```bash
# Depuis le terminal du projet
./gradlew --version       # Vérifier Gradle
./gradlew tasks           # Lister les tâches disponibles
```

## 🔨 Compiler l'Application

### Option 1: Via Android Studio (Recommandé)

1. Cliquer sur **Build** dans le menu
2. Sélectionner **"Make Project"** (ou Ctrl+F9)
3. Vérifier la console pour les erreurs

### Option 2: Via Terminal

```bash
# Compiler en debug
./gradlew build

# Compiler en release (signé)
./gradlew assembleRelease

# Pour un APK debug uniquement
./gradlew assembleDebug
```

### Résultat
L'APK compilée sera disponible à:
- **Debug**: `app/build/outputs/apk/debug/app-debug.apk`
- **Release**: `app/build/outputs/apk/release/app-release.apk`

## ▶️ Exécuter l'Application

### Option 1: Android Studio

1. **Connecter un Appareil Android** ou **Lancer un Émulateur**
   - Appareil: Connecter via USB + activer le mode développeur
   - Émulateur: Tools → Device Manager → Créer un AVD

2. Cliquer sur le bouton **Run** (Shift+F10)
   - Ou: Run → Run 'app'

3. Sélectionner l'appareil/émulateur cible

### Option 2: Via Terminal

```bash
# Installer sur un appareil/émulateur connecté
./gradlew installDebug

# Lancer l'application
adb shell am start -n com.voulagnan/com.voulagnan.MainActivity

# Voir les logs en direct
adb logcat
```

### Option 3: Installation Manuelle

```bash
# Générer l'APK
./gradlew assembleDebug

# Installer l'APK
adb install app/build/outputs/apk/debug/app-debug.apk

# Ou double-cliquer sur l'APK dans le gestionnaire de fichiers
```

## 🧪 Tests

```bash
# Exécuter les tests unitaires
./gradlew test

# Exécuter les tests instrumentalisés (sur appareil)
./gradlew connectedAndroidTest

# Générer un rapport de tests
./gradlew connectedAndroidTest --info
```

## 🔍 Vérifier et Déboguer

### Vérifier la Syntaxe
```bash
./gradlew lint
```

### Voir les Dépendances
```bash
./gradlew dependencies
```

### Nettoyer et Reconstruire
```bash
./gradlew clean build
```

### Ouvrir la Console Logcat
```bash
# Dans Android Studio
View → Tool Windows → Logcat
```

## 📦 Générer un APK pour Distribution

### APK de Release (Pour Google Play, etc.)

```bash
# 1. Générer l'APK signée
./gradlew assembleRelease

# 2. Signer manuellement si besoin
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 \
  -keystore keystore.jks \
  app/build/outputs/apk/release/app-release-unsigned.apk \
  your-key-alias

# 3. Aligner les ressources (optimisation)
zipalign -v 4 app-release-unsigned.apk app-release.apk
```

### Créer un Keystore de Signature
```bash
keytool -genkey -v -keystore keystore.jks \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -alias voulagnan-key
```

## 🚨 Messages d'Erreur Courants

### ❌ "Android SDK not found"
```bash
# Solution: Définir ANDROID_HOME
export ANDROID_HOME=/path/to/android/sdk
# Sur Windows: set ANDROID_HOME=C:\Android\Sdk
```

### ❌ "Build failed: Gradle sync failed"
```bash
# Solution: 
./gradlew clean
./gradlew assemble
```

### ❌ "compileSdkVersion not found"
```bash
# Solution: Télécharger l'API 33
# Android Studio → Tools → SDK Manager → API 33
```

### ❌ "No connected devices"
```bash
# Solution: Vérifier les appareils connectés
adb devices

# Si aucun appareil, lancer un émulateur
Android Studio → Tools → Device Manager → Start Emulator
```

## 📊 Configuration de Build

### Modifier la Version
Éditer `app/build.gradle`:
```gradle
defaultConfig {
    versionCode 2      # Incrémenter pour mise à jour
    versionName "1.1"  # Nouvelle version
}
```

### Changer le Package Name
1. Clic-droit sur le package dans Android Studio
2. Refactor → Rename Package

## 🎯 Vérifier Liste de Contrôle

- ✅ Android Studio installé
- ✅ Android SDK installé (API 21-33)
- ✅ Java JDK 1.8+ installé
- ✅ Dépôt cloné
- ✅ Gradle construit avec succès
- ✅ Tests passés
- ✅ APK générée
- ✅ Suite testée sur appareil/émulateur

## 📱 Caractéristiques de l'Application

Une fois compilée et exécutée, Voulagnan offre:

- ✓ **Écran d'accueil** avec boutons de navigation
- ✓ **Chat en temps réel** avec réponses automatiques
- ✓ **Conversation** mode classique
- ✓ **Interface Material Design** moderne
- ✓ **Support du clavier** pour saisie rapide
- ✓ **Navigation fluide** entre écrans

## 🔐 Licence

Voulagnan est soumis à une **licence propriétaire exclusif**
Seul Lloyd Moustadrani ou les personnes autorisées peuvent modifier/distribuer.

## 📞 Support

Pour toute question ou problème:
1. Consulter les logs Android (Logcat)
2. Vérifier le fichier AndroidManifest.xml
3. Voir le README.md pour plus de détails
4. Créer une issue sur GitHub

---

**Voulagnan v1.0** | Prêt pour Production | © Lloyd Moustadrani
