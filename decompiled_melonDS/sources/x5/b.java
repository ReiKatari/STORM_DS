package x5;

import a0.l;
import android.text.SpannableStringBuilder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f14358b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f14359c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f14360d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f14361e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14362a;

    static {
        l lVar = g.f14370c;
        f14358b = Character.toString((char) 8206);
        f14359c = Character.toString((char) 8207);
        f14360d = new b(false);
        f14361e = new b(true);
    }

    public b(boolean z10) {
        l lVar = g.f14368a;
        this.f14362a = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r2 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r0.f14356c <= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
        switch(r0.a()) {
            case 14: goto L61;
            case 15: goto L61;
            case 16: goto L56;
            case 17: goto L56;
            case 18: goto L52;
            default: goto L64;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (r1 != r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r1 != r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            x5.a r0 = new x5.a
            r0.<init>(r9)
            r9 = 0
            r0.f14356c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f14356c
            int r5 = r0.f14355b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6d
            if (r1 != 0) goto L6d
            java.lang.CharSequence r5 = r0.f14354a
            char r4 = r5.charAt(r4)
            r0.f14357d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            int r8 = r0.f14356c
            if (r4 == 0) goto L37
            int r4 = java.lang.Character.codePointAt(r5, r8)
            int r5 = r0.f14356c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f14356c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4a
        L37:
            int r8 = r8 + 1
            r0.f14356c = r8
            char r4 = r0.f14357d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L46
            byte[] r5 = x5.a.f14353e
            r4 = r5[r4]
            goto L4a
        L46:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4a:
            if (r4 == 0) goto L68
            if (r4 == r7) goto L65
            r5 = 2
            if (r4 == r5) goto L65
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L61;
                case 15: goto L61;
                case 16: goto L5d;
                case 17: goto L5d;
                case 18: goto L59;
                default: goto L58;
            }
        L58:
            goto L6b
        L59:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5d:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L61:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L65:
            if (r3 != 0) goto L6b
            goto L84
        L68:
            if (r3 != 0) goto L6b
            goto L8a
        L6b:
            r1 = r3
            goto Lb
        L6d:
            if (r1 != 0) goto L70
            goto L8b
        L70:
            if (r2 == 0) goto L73
            return r2
        L73:
            int r2 = r0.f14356c
            if (r2 <= 0) goto L8b
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L82;
                case 17: goto L82;
                case 18: goto L7f;
                default: goto L7e;
            }
        L7e:
            goto L73
        L7f:
            int r3 = r3 + 1
            goto L73
        L82:
            if (r1 != r3) goto L85
        L84:
            return r7
        L85:
            int r3 = r3 + (-1)
            goto L73
        L88:
            if (r1 != r3) goto L85
        L8a:
            return r6
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            x5.a r0 = new x5.a
            r0.<init>(r6)
            int r6 = r0.f14355b
            r0.f14356c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f14356c
            if (r3 <= 0) goto L3f
            byte r3 = r0.a()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        l lVar;
        String str;
        l lVar2;
        char c4;
        l lVar3 = g.f14370c;
        if (charSequence == null) {
            return null;
        }
        boolean h2 = lVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h2) {
            lVar = g.f14369b;
        } else {
            lVar = g.f14368a;
        }
        boolean h10 = lVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f14359c;
        String str4 = f14358b;
        boolean z10 = this.f14362a;
        if (!z10 && (h10 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z10 || (h10 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (h2 != z10) {
            if (h2) {
                c4 = 8235;
            } else {
                c4 = 8234;
            }
            spannableStringBuilder.append(c4);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (h2) {
            lVar2 = g.f14369b;
        } else {
            lVar2 = g.f14368a;
        }
        boolean h11 = lVar2.h(charSequence.length(), charSequence);
        if (!z10 && (h11 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!h11 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
