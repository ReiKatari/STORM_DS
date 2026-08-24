package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e13  reason: default package */
/* loaded from: classes.dex */
public abstract class e13 {
    public static final java.util.TimeZone a = null;

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            defpackage.e13.a = r0
            return
    }

    public static boolean a(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
            r1 = r17
            r2 = r18
            int r0 = r2.getIndex()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r3 = r0 + 4
            int r4 = c(r0, r3, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r5 = 45
            boolean r6 = a(r1, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r7 = 5
            if (r6 == 0) goto L19
            int r3 = r0 + 5
        L19:
            int r0 = r3 + 2
            int r6 = c(r3, r0, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r8 = a(r1, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r8 == 0) goto L27
            int r0 = r3 + 3
        L27:
            int r3 = r0 + 2
            int r8 = c(r0, r3, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r9 = 84
            boolean r9 = a(r1, r3, r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L54
            int r12 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 > r3) goto L54
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.setLenient(r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r2.setIndex(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            return r0
        L4e:
            r0 = move-exception
            goto L1e2
        L51:
            r0 = move-exception
            goto L1e2
        L54:
            r12 = 43
            r13 = 90
            r14 = 2
            if (r9 == 0) goto Lee
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = c(r3, r9, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r15 = 58
            boolean r16 = a(r1, r9, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r16 == 0) goto L6d
            int r9 = r0 + 6
        L6d:
            int r0 = r9 + 2
            int r16 = c(r9, r0, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r15 = a(r1, r0, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r15 == 0) goto L7c
            int r9 = r9 + 3
            r0 = r9
        L7c:
            int r9 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r9 <= r0) goto Le6
            char r9 = r1.charAt(r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r9 == r13) goto Le6
            if (r9 == r12) goto Le6
            if (r9 == r5) goto Le6
            int r9 = r0 + 2
            int r15 = c(r0, r9, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r11 = 59
            if (r15 <= r11) goto L9c
            r11 = 63
            if (r15 >= r11) goto L9c
            r15 = 59
        L9c:
            r11 = 46
            boolean r11 = a(r1, r9, r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r11 == 0) goto Le0
            int r9 = r0 + 3
            int r11 = r0 + 4
        La8:
            int r7 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r11 >= r7) goto Lc2
            char r7 = r1.charAt(r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r5 = 48
            if (r7 < r5) goto Lc0
            r5 = 57
            if (r7 <= r5) goto Lbb
            goto Lc0
        Lbb:
            int r11 = r11 + 1
            r5 = 45
            goto La8
        Lc0:
            r5 = r11
            goto Lc6
        Lc2:
            int r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        Lc6:
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r7 = c(r9, r0, r1)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r0 = r0 - r9
            if (r0 == r10) goto Ld9
            if (r0 == r14) goto Ld6
            goto Ldb
        Ld6:
            int r7 = r7 * 10
            goto Ldb
        Ld9:
            int r7 = r7 * 100
        Ldb:
            r0 = r3
            r3 = r5
            r5 = r16
            goto Lf1
        Le0:
            r0 = r3
            r3 = r9
            r5 = r16
            r7 = 0
            goto Lf1
        Le6:
            r5 = r3
            r3 = r0
            r0 = r5
            r5 = r16
        Leb:
            r7 = 0
            r15 = 0
            goto Lf1
        Lee:
            r0 = 0
            r5 = 0
            goto Leb
        Lf1:
            int r9 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r9 <= r3) goto L1da
            char r9 = r1.charAt(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.TimeZone r11 = defpackage.e13.a
            if (r9 != r13) goto L102
            int r3 = r3 + r10
            goto L1a9
        L102:
            if (r9 == r12) goto L125
            r12 = 45
            if (r9 != r12) goto L109
            goto L125
        L109:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L125:
            java.lang.String r9 = r1.substring(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r12 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r13 = 5
            if (r12 < r13) goto L131
            goto L142
        L131:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.append(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r9 = "00"
            r12.append(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r9 = r12.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L142:
            int r12 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r3 = r3 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 != 0) goto L1a9
            java.lang.String r12 = "+00:00"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 == 0) goto L158
            goto L1a9
        L158:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r11.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r12 = "GMT"
            r11.append(r12)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r11.append(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r9 = r11.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r12 = r11.getID()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r13 = r12.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r13 != 0) goto L1a9
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r12 = r12.replace(r13, r14)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r12 = r12.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 == 0) goto L186
            goto L1a9
        L186:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = r11.getID()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L1a9:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r9.<init>(r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r11 = 0
            r9.setLenient(r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r9.set(r10, r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r6 = r6 - r10
            r4 = 2
            r9.set(r4, r6)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r13 = 5
            r9.set(r13, r8)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r4 = 11
            r9.set(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 12
            r9.set(r0, r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 13
            r9.set(r0, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 14
            r9.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r2.setIndex(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.Date r0 = r9.getTime()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            return r0
        L1da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L1e2:
            if (r1 != 0) goto L1e6
            r1 = 0
            goto L1ee
        L1e6:
            java.lang.String r3 = "\""
            r4 = 34
            java.lang.String r1 = defpackage.i61.k(r4, r3, r1)
        L1ee:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1fa
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L215
        L1fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L215:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r2.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    public static int c(int r5, int r6, java.lang.String r7) {
            if (r5 < 0) goto L51
            int r0 = r7.length()
            if (r6 > r0) goto L51
            if (r5 > r6) goto L51
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r5 >= r6) goto L2c
            int r2 = r5 + 1
            char r3 = r7.charAt(r5)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L2e
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r5 = r7.substring(r5, r6)
            java.lang.String r5 = r0.concat(r5)
            r1.<init>(r5)
            throw r1
        L2c:
            r3 = 0
            r2 = r5
        L2e:
            if (r2 >= r6) goto L4f
            int r4 = r2 + 1
            char r2 = r7.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L41
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L2e
        L41:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r5 = r7.substring(r5, r6)
            java.lang.String r5 = r0.concat(r5)
            r1.<init>(r5)
            throw r1
        L4f:
            int r5 = -r3
            return r5
        L51:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r7)
            throw r5
    }
}
