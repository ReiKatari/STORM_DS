package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db0  reason: default package */
/* loaded from: classes.dex */
public final class db0 {
    public final java.util.LinkedHashSet a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final java.util.ArrayList e;
    public final defpackage.pr6 f;
    public final defpackage.di7 g;
    public final java.util.HashMap h;
    public final defpackage.sr6 i;
    public final defpackage.sr6 j;

    public db0(java.util.LinkedHashSet r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, defpackage.pr6 r6, defpackage.di7 r7, java.util.HashMap r8, defpackage.sr6 r9, defpackage.sr6 r10) {
            r0 = this;
            r9.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof defpackage.db0
            if (r0 != 0) goto La
            goto L79
        La:
            db0 r3 = (defpackage.db0) r3
            java.util.LinkedHashSet r0 = r2.a
            java.util.LinkedHashSet r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L79
        L17:
            java.util.ArrayList r0 = r2.b
            java.util.ArrayList r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L79
        L22:
            java.util.ArrayList r0 = r2.c
            java.util.ArrayList r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L79
        L2d:
            java.util.ArrayList r0 = r2.d
            java.util.ArrayList r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L79
        L38:
            java.util.ArrayList r0 = r2.e
            java.util.ArrayList r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L79
        L43:
            pr6 r0 = r2.f
            pr6 r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4e
            goto L79
        L4e:
            di7 r0 = r2.g
            di7 r1 = r3.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L59
            goto L79
        L59:
            java.util.HashMap r0 = r2.h
            java.util.HashMap r1 = r3.h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            sr6 r0 = r2.i
            sr6 r1 = r3.i
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            sr6 r2 = r2.j
            sr6 r3 = r3.j
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L7b
        L79:
            r2 = 0
            return r2
        L7b:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.LinkedHashSet r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.ArrayList r1 = r3.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r1 = r3.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r3.e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            r1 = 0
            pr6 r2 = r3.f
            if (r2 != 0) goto L33
            r2 = r1
            goto L37
        L33:
            int r2 = r2.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * 31
            di7 r2 = r3.g
            if (r2 != 0) goto L40
            r2 = r1
            goto L44
        L40:
            int r2 = r2.hashCode()
        L44:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.HashMap r2 = r3.h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            sr6 r0 = r3.i
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            sr6 r3 = r3.j
            if (r3 != 0) goto L5e
            goto L62
        L5e:
            int r1 = r3.hashCode()
        L62:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CalculatedUseCaseInfo(appUseCases="
            r0.<init>(r1)
            java.util.LinkedHashSet r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cameraUseCases="
            r0.append(r1)
            java.util.ArrayList r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cameraUseCasesToAttach="
            r0.append(r1)
            java.util.ArrayList r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", cameraUseCasesToKeep="
            r0.append(r1)
            java.util.ArrayList r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cameraUseCasesToDetach="
            r0.append(r1)
            java.util.ArrayList r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", streamSharing="
            r0.append(r1)
            pr6 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", placeholderForExtensions="
            r0.append(r1)
            di7 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", useCaseConfigs="
            r0.append(r1)
            java.util.HashMap r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", primaryStreamSpecResult="
            r0.append(r1)
            sr6 r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", secondaryStreamSpecResult="
            r0.append(r1)
            sr6 r2 = r2.j
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
