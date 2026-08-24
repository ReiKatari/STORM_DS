package defpackage;

import android.text.SpannableStringBuilder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g40  reason: default package */
/* loaded from: classes.dex */
public final class g40 {
    public static final String b;
    public static final String c;
    public static final g40 d;
    public static final g40 e;
    public final boolean a;

    static {
        g60 g60Var = f17.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new g40(false);
        e = new g40(true);
    }

    public g40(boolean z) {
        g60 g60Var = f17.a;
        this.a = z;
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
        if (r0.c <= 0) goto L65;
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
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        f40 f40Var = new f40(charSequence);
        f40Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = f40Var.c;
            if (i4 < f40Var.b && i == 0) {
                CharSequence charSequence2 = f40Var.a;
                char charAt = charSequence2.charAt(i4);
                f40Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = f40Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    f40Var.c = Character.charCount(codePointAt) + f40Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    f40Var.c = i5 + 1;
                    char c2 = f40Var.d;
                    if (c2 < 1792) {
                        directionality = f40.e[c2];
                    } else {
                        directionality = Character.getDirectionality(c2);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        f40 f40Var = new f40(charSequence);
        f40Var.c = f40Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (f40Var.c > 0) {
                byte a = f40Var.a();
                if (a != 0) {
                    if (a != 1 && a != 2) {
                        if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        break;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        g60 g60Var;
        String str;
        g60 g60Var2;
        char c2;
        g60 g60Var3 = f17.c;
        if (charSequence == null) {
            return null;
        }
        boolean e2 = g60Var3.e(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (e2) {
            g60Var = f17.b;
        } else {
            g60Var = f17.a;
        }
        boolean e3 = g60Var.e(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (!z && (e3 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z || (e3 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (e2 != z) {
            if (e2) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (e2) {
            g60Var2 = f17.b;
        } else {
            g60Var2 = f17.a;
        }
        boolean e4 = g60Var2.e(charSequence.length(), charSequence);
        if (!z && (e4 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!e4 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
