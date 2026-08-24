package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex3  reason: default package */
/* loaded from: classes.dex */
public abstract class ex3 {
    public static java.lang.String a(int r6, defpackage.qn2 r7, java.lang.String r8, java.util.List r9) {
            r0 = r6 & 1
            if (r0 == 0) goto L6
            java.lang.String r8 = ", "
        L6:
            r0 = r6 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            r0 = r1
            goto L10
        Le:
            java.lang.String r0 = "[\n\t"
        L10:
            r2 = r6 & 4
            if (r2 == 0) goto L15
            goto L17
        L15:
            java.lang.String r1 = "\n]"
        L17:
            r6 = r6 & 32
            if (r6 == 0) goto L1c
            r7 = 0
        L1c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            int r0 = r9.size()
            r2 = 0
            r3 = r2
        L2a:
            if (r2 >= r0) goto L68
            java.lang.Object r4 = r9.get(r2)
            r5 = 1
            int r3 = r3 + r5
            if (r3 <= r5) goto L37
            r6.append(r8)
        L37:
            if (r7 == 0) goto L43
            java.lang.Object r4 = r7.g(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.append(r4)
            goto L65
        L43:
            if (r4 != 0) goto L46
            goto L48
        L46:
            boolean r5 = r4 instanceof java.lang.CharSequence
        L48:
            if (r5 == 0) goto L50
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.append(r4)
            goto L65
        L50:
            boolean r5 = r4 instanceof java.lang.Character
            if (r5 == 0) goto L5e
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            r6.append(r4)
            goto L65
        L5e:
            java.lang.String r4 = r4.toString()
            r6.append(r4)
        L65:
            int r2 = r2 + 1
            goto L2a
        L68:
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            return r6
    }

    public static final java.lang.Void b(java.lang.String r1) {
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
    }

    public static final void c(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }
}
