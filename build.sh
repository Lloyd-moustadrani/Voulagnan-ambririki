#!/bin/bash

echo "╔════════════════════════════════════════════════════════════════╗"
echo "║          VOULAGNAN - BUILD AUTOMATION SCRIPT v1.0            ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo

# Vérifier les prérequis
echo "📋 Vérification des prérequis..."

if ! command -v java &> /dev/null; then
    echo "❌ Java n'est pas installé"
    exit 1
fi
echo "✓ Java détecté: $(java -version 2>&1 | head -1)"

if ! command -v gradle &> /dev/null; then
    echo "⚠️  Gradle non trouvé globalement, utilisation du gradlew"
fi
echo

# Choisir l'option de build
echo "Sélectionnez une option de build:"
echo "1) Build Debug (APK de développement)"
echo "2) Build Release (APK pour distribution)"
echo "3) Build + Install Debug (compiler et installer)"
echo "4) Make Project (compilation complète)"
echo "5) Clean Build (nettoyer et reconstruire)"
echo

read -p "Choisissez une option (1-5): " choice

case $choice in
    1)
        echo "🔨 Compilation Debug..."
        ./gradlew assembleDebug
        if [ $? -eq 0 ]; then
            echo "✅ APK Debug créée: app/build/outputs/apk/debug/app-debug.apk"
        else
            echo "❌ La compilation a échoué"
            exit 1
        fi
        ;;
    2)
        echo "🔨 Compilation Release..."
        ./gradlew assembleRelease
        if [ $? -eq 0 ]; then
            echo "✅ APK Release créée: app/build/outputs/apk/release/app-release.apk"
        else
            echo "❌ La compilation a échoué"
            exit 1
        fi
        ;;
    3)
        echo "🔨 Compilation Debug + Installation..."
        ./gradlew installDebug
        if [ $? -eq 0 ]; then
            echo "✅ Application installée sur l'appareil/émulateur"
            echo "🚀 Lancement de l'application..."
            adb shell am start -n com.voulagnan/com.voulagnan.MainActivity
        else
            echo "❌ La compilation ou l'installation a échoué"
            exit 1
        fi
        ;;
    4)
        echo "🔨 Compilation complète (Make Project)..."
        ./gradlew build
        if [ $? -eq 0 ]; then
            echo "✅ Compilation réussie"
        else
            echo "❌ La compilation a échoué"
            exit 1
        fi
        ;;
    5)
        echo "🧹 Nettoyage et reconstruction..."
        ./gradlew clean build
        if [ $? -eq 0 ]; then
            echo "✅ Reconstruction complète réussie"
        else
            echo "❌ Le nettoyage/reconstruction a échoué"
            exit 1
        fi
        ;;
    *)
        echo "❌ Option invalide"
        exit 1
        ;;
esac

echo
echo "╔════════════════════════════════════════════════════════════════╗"
echo "║                    BUILD TERMINÉ ✅                           ║"
echo "╚════════════════════════════════════════════════════════════════╝"
