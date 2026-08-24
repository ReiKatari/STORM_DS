package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq2  reason: default package */
/* loaded from: classes.dex */
public final class jq2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static kq2 a(String str) {
        kq2 em5Var;
        kq2 kq2Var;
        if (str != null && !qs6.v0(str)) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                em5Var = kq2.valueOf(upperCase);
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                String upperCase2 = str.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                switch (upperCase2.hashCode()) {
                    case -2074478255:
                        if (upperCase2.equals("HERO_DARK_VIGILANTE")) {
                            kq2Var = kq2.HERO_DARK_VIGILANTE;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case -1355680822:
                        if (upperCase2.equals("MERCHANT_NPC")) {
                            kq2Var = kq2.MERCHANT;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case -1226178657:
                        if (upperCase2.equals("CHILD_FAIRY_COMPANION")) {
                            kq2Var = kq2.YOUNG_BOY;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case -395067076:
                        if (upperCase2.equals("VILLAIN_MANIC_JOKER")) {
                            kq2Var = kq2.VILLAIN_MANIC;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case -385983348:
                        if (upperCase2.equals("MYSTICAL_CREATURE")) {
                            kq2Var = kq2.CHEERFUL_FAIRY;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 660228329:
                        if (upperCase2.equals("ELDER_ANCIENT_BOSS")) {
                            kq2Var = kq2.VILLAIN_BOSS;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 674256882:
                        if (upperCase2.equals("ROBOTIC_AI_TECH")) {
                            kq2Var = kq2.CYBORG_ROBOT;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 729501733:
                        if (upperCase2.equals("HEROINE_FEMALE")) {
                            kq2Var = kq2.PROTAGONIST_FEMALE;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 1064358793:
                        if (upperCase2.equals("NARRATOR_CHRONICLE")) {
                            kq2Var = kq2.NARRATOR;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 1517011208:
                        if (upperCase2.equals("PIRATE_ADVENTURER")) {
                            kq2Var = kq2.PIRATE;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    case 1982863587:
                        if (upperCase2.equals("COMEDY_CHARACTER")) {
                            kq2Var = kq2.COMEDY_GOOFY;
                            break;
                        }
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                    default:
                        kq2Var = kq2.PROTAGONIST_MALE;
                        break;
                }
                em5Var = kq2Var;
            }
            return (kq2) em5Var;
        }
        return kq2.PROTAGONIST_MALE;
    }
}
