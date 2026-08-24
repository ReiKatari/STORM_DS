package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq2  reason: default package */
/* loaded from: classes.dex */
public final class jq2 {
    public static defpackage.kq2 a(java.lang.String r2) {
            if (r2 == 0) goto Lc7
            boolean r0 = defpackage.qs6.v0(r2)
            if (r0 == 0) goto La
            goto Lc7
        La:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch: java.lang.Throwable -> L18
            r0.getClass()     // Catch: java.lang.Throwable -> L18
            kq2 r0 = defpackage.kq2.valueOf(r0)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L1f:
            java.lang.Throwable r1 = defpackage.hm5.a(r0)
            if (r1 != 0) goto L27
            goto Lc4
        L27:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r0)
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case -2074478255: goto Lb6;
                case -1355680822: goto Laa;
                case -1226178657: goto L9e;
                case -395067076: goto L92;
                case -385983348: goto L86;
                case 660228329: goto L7a;
                case 674256882: goto L6e;
                case 729501733: goto L62;
                case 1064358793: goto L55;
                case 1517011208: goto L48;
                case 1982863587: goto L39;
                default: goto L37;
            }
        L37:
            goto Lbe
        L39:
            java.lang.String r0 = "COMEDY_CHARACTER"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto Lbe
        L43:
            kq2 r2 = defpackage.kq2.COMEDY_GOOFY
        L45:
            r0 = r2
            goto Lc4
        L48:
            java.lang.String r0 = "PIRATE_ADVENTURER"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L52
            goto Lbe
        L52:
            kq2 r2 = defpackage.kq2.PIRATE
            goto L45
        L55:
            java.lang.String r0 = "NARRATOR_CHRONICLE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5f
            goto Lbe
        L5f:
            kq2 r2 = defpackage.kq2.NARRATOR
            goto L45
        L62:
            java.lang.String r0 = "HEROINE_FEMALE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6b
            goto Lbe
        L6b:
            kq2 r2 = defpackage.kq2.PROTAGONIST_FEMALE
            goto L45
        L6e:
            java.lang.String r0 = "ROBOTIC_AI_TECH"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto Lbe
        L77:
            kq2 r2 = defpackage.kq2.CYBORG_ROBOT
            goto L45
        L7a:
            java.lang.String r0 = "ELDER_ANCIENT_BOSS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L83
            goto Lbe
        L83:
            kq2 r2 = defpackage.kq2.VILLAIN_BOSS
            goto L45
        L86:
            java.lang.String r0 = "MYSTICAL_CREATURE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L8f
            goto Lbe
        L8f:
            kq2 r2 = defpackage.kq2.CHEERFUL_FAIRY
            goto L45
        L92:
            java.lang.String r0 = "VILLAIN_MANIC_JOKER"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9b
            goto Lbe
        L9b:
            kq2 r2 = defpackage.kq2.VILLAIN_MANIC
            goto L45
        L9e:
            java.lang.String r0 = "CHILD_FAIRY_COMPANION"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La7
            goto Lbe
        La7:
            kq2 r2 = defpackage.kq2.YOUNG_BOY
            goto L45
        Laa:
            java.lang.String r0 = "MERCHANT_NPC"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb3
            goto Lbe
        Lb3:
            kq2 r2 = defpackage.kq2.MERCHANT
            goto L45
        Lb6:
            java.lang.String r0 = "HERO_DARK_VIGILANTE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc1
        Lbe:
            kq2 r2 = defpackage.kq2.PROTAGONIST_MALE
            goto L45
        Lc1:
            kq2 r2 = defpackage.kq2.HERO_DARK_VIGILANTE
            goto L45
        Lc4:
            kq2 r0 = (defpackage.kq2) r0
            return r0
        Lc7:
            kq2 r2 = defpackage.kq2.PROTAGONIST_MALE
            return r2
    }
}
