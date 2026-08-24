package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v53  reason: default package */
/* loaded from: classes.dex */
public final class v53 {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final yc1 d;
    public String e;
    public int f;
    public mh1 g;
    public m70 h;

    public v53(yc1 yc1Var) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new uv('*'), new uv('_')), hashMap);
        b((List) yc1Var.A, hashMap);
        this.c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch : keySet) {
            bitSet.set(ch.charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = yc1Var;
    }

    public static void a(char c, nh1 nh1Var, HashMap hashMap) {
        if (((nh1) hashMap.put(Character.valueOf(c), nh1Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(Iterable iterable, HashMap hashMap) {
        uo6 uo6Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nh1 nh1Var = (nh1) it.next();
            char e = nh1Var.e();
            char b = nh1Var.b();
            if (e == b) {
                nh1 nh1Var2 = (nh1) hashMap.get(Character.valueOf(e));
                if (nh1Var2 != null && nh1Var2.e() == nh1Var2.b()) {
                    if (nh1Var2 instanceof uo6) {
                        uo6Var = (uo6) nh1Var2;
                    } else {
                        uo6 uo6Var2 = new uo6(e);
                        uo6Var2.f(nh1Var2);
                        uo6Var = uo6Var2;
                    }
                    uo6Var.f(nh1Var);
                    hashMap.put(Character.valueOf(e), uo6Var);
                } else {
                    a(e, nh1Var, hashMap);
                }
            } else {
                a(e, nh1Var, hashMap);
                a(b, nh1Var, hashMap);
            }
        }
    }

    public static void d(vz6 vz6Var, vz6 vz6Var2, int i2) {
        if (vz6Var != null && vz6Var2 != null && vz6Var != vz6Var2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(vz6Var.g);
            a21 a21Var = (a21) vz6Var2.f;
            for (a21 a21Var2 = (a21) vz6Var.f; a21Var2 != a21Var; a21Var2 = (a21) a21Var2.f) {
                sb.append(((vz6) a21Var2).g);
                a21Var2.j();
            }
            vz6Var.g = sb.toString();
        }
    }

    public static void e(a21 a21Var, a21 a21Var2) {
        vz6 vz6Var = null;
        vz6 vz6Var2 = null;
        int i2 = 0;
        while (a21Var != null) {
            if (a21Var instanceof vz6) {
                vz6Var2 = (vz6) a21Var;
                if (vz6Var == null) {
                    vz6Var = vz6Var2;
                }
                i2 = vz6Var2.g.length() + i2;
            } else {
                d(vz6Var, vz6Var2, i2);
                vz6Var = null;
                vz6Var2 = null;
                i2 = 0;
            }
            if (a21Var == a21Var2) {
                break;
            }
            a21Var = (a21) a21Var.f;
        }
        d(vz6Var, vz6Var2, i2);
    }

    public final String c(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x054b A[LOOP:0: B:3:0x0013->B:265:0x054b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v17, types: [a21, hs0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [a21] */
    /* JADX WARN: Type inference failed for: r4v28, types: [a21, m13] */
    /* JADX WARN: Type inference failed for: r4v44, types: [vz6] */
    /* JADX WARN: Type inference failed for: r4v45, types: [vz6] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v22, types: [u53] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str, a21 a21Var) {
        int i2;
        a21 a21Var2;
        vz6 vz6Var;
        int i3;
        vz6 vz6Var2;
        a21 vz6Var3;
        a21 a21Var3;
        vz6 vz6Var4;
        mv3 mv3Var;
        String c;
        ?? a21Var4;
        int i4;
        String str2;
        String str3;
        boolean z;
        String str4;
        String substring;
        int i5;
        int i6;
        vz6 vz6Var5;
        String substring2;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r4;
        ?? r8;
        int i11;
        u53 u53Var;
        this.e = str.trim();
        int i12 = 0;
        this.f = 0;
        vz6 vz6Var6 = null;
        this.g = null;
        this.h = null;
        vz6 vz6Var7 = null;
        while (true) {
            char g = g();
            if (g == 0) {
                i2 = i12;
            } else {
                if (g != '\n') {
                    if (g != '!') {
                        if (g != '&') {
                            if (g != '<') {
                                if (g != '`') {
                                    switch (g) {
                                        case '[':
                                            int i13 = this.f;
                                            this.f = i13 + 1;
                                            vz6 vz6Var8 = new vz6("[");
                                            m70 m70Var = this.h;
                                            m70 m70Var2 = new m70(vz6Var8, i13, m70Var, this.g, false);
                                            if (m70Var != null) {
                                                m70Var.g = true;
                                            }
                                            this.h = m70Var2;
                                            a21Var3 = vz6Var8;
                                            break;
                                        case '\\':
                                            this.f++;
                                            if (g() == '\n') {
                                                vz6Var3 = new a21();
                                                this.f++;
                                            } else {
                                                if (this.f < this.e.length()) {
                                                    String str5 = this.e;
                                                    int i14 = this.f;
                                                    if (k.matcher(str5.substring(i14, i14 + 1)).matches()) {
                                                        String str6 = this.e;
                                                        int i15 = this.f;
                                                        vz6 vz6Var9 = new vz6(str6.substring(i15, i15 + 1));
                                                        this.f++;
                                                        a21Var3 = vz6Var9;
                                                        break;
                                                    }
                                                }
                                                vz6Var3 = new vz6("\\");
                                            }
                                            a21Var3 = vz6Var3;
                                            break;
                                        case ']':
                                            int i16 = this.f + 1;
                                            this.f = i16;
                                            m70 m70Var3 = this.h;
                                            if (m70Var3 == null) {
                                                a21Var4 = new vz6("]");
                                                break;
                                            } else {
                                                vz6 vz6Var10 = m70Var3.a;
                                                boolean z2 = m70Var3.c;
                                                if (!m70Var3.f) {
                                                    this.h = m70Var3.d;
                                                    a21Var4 = new vz6("]");
                                                    break;
                                                } else {
                                                    if (g() == '(') {
                                                        this.f++;
                                                        Pattern pattern = q;
                                                        c(pattern);
                                                        i4 = 1;
                                                        int Y = ln2.Y(this.f, this.e);
                                                        if (Y == -1) {
                                                            str2 = null;
                                                        } else {
                                                            char g2 = g();
                                                            String str7 = this.e;
                                                            int i17 = this.f;
                                                            if (g2 == '<') {
                                                                substring = str7.substring(i17 + 1, Y - 1);
                                                            } else {
                                                                substring = str7.substring(i17, Y);
                                                            }
                                                            this.f = Y;
                                                            str2 = c62.a(substring);
                                                        }
                                                        if (str2 != null) {
                                                            c(pattern);
                                                            String str8 = this.e;
                                                            int i18 = this.f;
                                                            if (s.matcher(str8.substring(i18 - 1, i18)).matches()) {
                                                                String str9 = this.e;
                                                                int i19 = this.f;
                                                                if (i19 < str9.length()) {
                                                                    char charAt = str9.charAt(i19);
                                                                    char c2 = '\"';
                                                                    if (charAt != '\"') {
                                                                        c2 = '\'';
                                                                        if (charAt != '\'') {
                                                                            if (charAt == '(') {
                                                                                c2 = ')';
                                                                            }
                                                                        }
                                                                    }
                                                                    int a0 = ln2.a0(str9, i19 + 1, c2);
                                                                    if (a0 != -1 && a0 < str9.length() && str9.charAt(a0) == c2) {
                                                                        i5 = a0 + 1;
                                                                        i6 = -1;
                                                                        if (i5 != i6) {
                                                                            str3 = null;
                                                                        } else {
                                                                            String substring3 = this.e.substring(this.f + 1, i5 - 1);
                                                                            this.f = i5;
                                                                            str3 = c62.a(substring3);
                                                                        }
                                                                        c(pattern);
                                                                    }
                                                                }
                                                                i6 = -1;
                                                                i5 = -1;
                                                                if (i5 != i6) {
                                                                }
                                                                c(pattern);
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            if (g() == ')') {
                                                                this.f++;
                                                                z = true;
                                                                if (!z) {
                                                                    int i20 = this.f;
                                                                    if (i20 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                                        int i21 = this.f + 1;
                                                                        int Z = ln2.Z(i21, this.e);
                                                                        int i22 = Z - i21;
                                                                        if (Z != -1 && i22 <= 999 && Z < this.e.length() && this.e.charAt(Z) == ']') {
                                                                            this.f = Z + 1;
                                                                        }
                                                                    }
                                                                    int i23 = this.f - i20;
                                                                    if (i23 > 2) {
                                                                        str4 = this.e.substring(i20, i23 + i20);
                                                                    } else if (!m70Var3.g) {
                                                                        str4 = this.e.substring(m70Var3.b, i16);
                                                                    } else {
                                                                        str4 = null;
                                                                    }
                                                                    if (str4 != null) {
                                                                        Pattern pattern2 = c62.a;
                                                                        qv3 qv3Var = (qv3) ((Map) this.d.B).get(c62.c.matcher(str4.substring(i4, str4.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                                        if (qv3Var != null) {
                                                                            str2 = qv3Var.h;
                                                                            str3 = qv3Var.i;
                                                                            z = true;
                                                                        }
                                                                    }
                                                                }
                                                                if (z) {
                                                                    if (z2) {
                                                                        ?? a21Var5 = new a21();
                                                                        a21Var5.g = str2;
                                                                        a21Var5.h = str3;
                                                                        a21Var4 = a21Var5;
                                                                    } else {
                                                                        a21Var4 = new mv3(str2, str3);
                                                                    }
                                                                    for (a21 a21Var6 = (a21) vz6Var10.f; a21Var6 != null; a21Var6 = (a21) a21Var6.f) {
                                                                        a21Var4.b(a21Var6);
                                                                    }
                                                                    h(m70Var3.e);
                                                                    a21 a21Var7 = (a21) a21Var4.c;
                                                                    a21 a21Var8 = (a21) a21Var4.d;
                                                                    if (a21Var7 != a21Var8) {
                                                                        e(a21Var7, a21Var8);
                                                                    }
                                                                    vz6Var10.j();
                                                                    m70 m70Var4 = this.h.d;
                                                                    this.h = m70Var4;
                                                                    if (!z2) {
                                                                        while (m70Var4 != null) {
                                                                            if (!m70Var4.c) {
                                                                                m70Var4.f = false;
                                                                            }
                                                                            m70Var4 = m70Var4.d;
                                                                        }
                                                                        break;
                                                                    }
                                                                } else {
                                                                    this.f = i16;
                                                                    this.h = this.h.d;
                                                                    vz6Var3 = new vz6("]");
                                                                    a21Var3 = vz6Var3;
                                                                    break;
                                                                }
                                                            } else {
                                                                this.f = i16;
                                                                z = false;
                                                                if (!z) {
                                                                }
                                                                if (z) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i4 = 1;
                                                        str2 = null;
                                                    }
                                                    str3 = null;
                                                    z = false;
                                                    if (!z) {
                                                    }
                                                    if (z) {
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            if (this.b.get(g)) {
                                                nh1 nh1Var = (nh1) this.c.get(Character.valueOf(g));
                                                int i24 = this.f;
                                                int i25 = i12;
                                                while (g() == g) {
                                                    i25++;
                                                    this.f++;
                                                }
                                                if (i25 < nh1Var.c()) {
                                                    this.f = i24;
                                                    u53Var = vz6Var6;
                                                } else {
                                                    String str10 = "\n";
                                                    if (i24 == 0) {
                                                        substring2 = "\n";
                                                    } else {
                                                        substring2 = this.e.substring(i24 - 1, i24);
                                                    }
                                                    char g3 = g();
                                                    if (g3 != 0) {
                                                        str10 = String.valueOf(g3);
                                                    }
                                                    Pattern pattern3 = i;
                                                    boolean matches = pattern3.matcher(substring2).matches();
                                                    Pattern pattern4 = r;
                                                    boolean matches2 = pattern4.matcher(substring2).matches();
                                                    boolean matches3 = pattern3.matcher(str10).matches();
                                                    boolean matches4 = pattern4.matcher(str10).matches();
                                                    if (!matches4 && (!matches3 || matches2 || matches)) {
                                                        i7 = 1;
                                                    } else {
                                                        i7 = i12;
                                                    }
                                                    if (!matches2 && (!matches || matches4 || matches3)) {
                                                        i8 = 1;
                                                    } else {
                                                        i8 = i12;
                                                    }
                                                    if (g == '_') {
                                                        if (i7 != 0 && (i8 == 0 || matches)) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = i12;
                                                        }
                                                        if (i8 != 0 && (i7 == 0 || matches3)) {
                                                            r8 = 1;
                                                            r4 = i11;
                                                        } else {
                                                            r8 = i12;
                                                            r4 = i11;
                                                        }
                                                    } else {
                                                        if (i7 != 0 && g == nh1Var.e()) {
                                                            i9 = 1;
                                                        } else {
                                                            i9 = i12;
                                                        }
                                                        if (i8 != 0 && g == nh1Var.b()) {
                                                            i10 = 1;
                                                        } else {
                                                            i10 = i12;
                                                        }
                                                        r4 = i9;
                                                        r8 = i10;
                                                    }
                                                    this.f = i24;
                                                    u53Var = new u53(i25, r4, r8);
                                                }
                                                if (u53Var != 0) {
                                                    int i26 = u53Var.a;
                                                    int i27 = this.f;
                                                    int i28 = i27 + i26;
                                                    this.f = i28;
                                                    vz6 vz6Var11 = new vz6(this.e.substring(i27, i28));
                                                    boolean z3 = u53Var.c;
                                                    boolean z4 = u53Var.b;
                                                    mh1 mh1Var = this.g;
                                                    mh1 mh1Var2 = new mh1(vz6Var11, g, z3, z4, mh1Var);
                                                    this.g = mh1Var2;
                                                    mh1Var2.g = i26;
                                                    mh1Var2.h = i26;
                                                    if (mh1Var != null) {
                                                        mh1Var.f = mh1Var2;
                                                    }
                                                    vz6Var5 = vz6Var11;
                                                    i2 = i12;
                                                    vz6Var = vz6Var5;
                                                    break;
                                                }
                                                vz6Var5 = vz6Var6;
                                                i2 = i12;
                                                vz6Var = vz6Var5;
                                            } else {
                                                int i29 = this.f;
                                                int length = this.e.length();
                                                while (true) {
                                                    int i30 = this.f;
                                                    if (i30 != length) {
                                                        if (!this.a.get(this.e.charAt(i30))) {
                                                            this.f++;
                                                        }
                                                    }
                                                }
                                                int i31 = this.f;
                                                if (i29 != i31) {
                                                    vz6Var5 = new vz6(this.e.substring(i29, i31));
                                                    i2 = i12;
                                                    vz6Var = vz6Var5;
                                                }
                                                vz6Var5 = vz6Var6;
                                                i2 = i12;
                                                vz6Var = vz6Var5;
                                            }
                                            break;
                                    }
                                } else {
                                    String c3 = c(n);
                                    if (c3 != null) {
                                        int i32 = this.f;
                                        do {
                                            c = c(m);
                                            if (c == null) {
                                                this.f = i32;
                                                vz6Var4 = new vz6(c3);
                                                a21Var3 = vz6Var4;
                                            }
                                        } while (!c.equals(c3));
                                        a21Var4 = new a21();
                                        String replace = this.e.substring(i32, this.f - c3.length()).replace('\n', ' ');
                                        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                            int length2 = replace.length();
                                            if (bl2.S(' ', 0, length2, replace) != length2) {
                                                replace = replace.substring(1, replace.length() - 1);
                                            }
                                        }
                                        a21Var4.g = replace;
                                    }
                                    a21Var3 = null;
                                }
                                a21Var3 = a21Var4;
                            } else {
                                String c4 = c(o);
                                if (c4 != null) {
                                    String substring4 = c4.substring(1, c4.length() - 1);
                                    mv3Var = new mv3("mailto:".concat(substring4), null);
                                    mv3Var.b(new vz6(substring4));
                                } else {
                                    String c5 = c(p);
                                    if (c5 != null) {
                                        String substring5 = c5.substring(1, c5.length() - 1);
                                        mv3Var = new mv3(substring5, null);
                                        mv3Var.b(new vz6(substring5));
                                    } else {
                                        a21Var3 = null;
                                        if (a21Var3 == null) {
                                            if (c(j) != null) {
                                                vz6Var3 = new a21();
                                                a21Var3 = vz6Var3;
                                            }
                                            a21Var3 = null;
                                        }
                                    }
                                }
                                a21Var3 = mv3Var;
                                if (a21Var3 == null) {
                                }
                            }
                        } else {
                            String c6 = c(l);
                            if (c6 != null) {
                                vz6Var4 = new vz6(yy2.a(c6));
                                a21Var3 = vz6Var4;
                            }
                            a21Var3 = null;
                        }
                        i2 = 0;
                        vz6Var = a21Var3;
                    } else {
                        int i33 = this.f + 1;
                        this.f = i33;
                        if (g() == '[') {
                            this.f++;
                            vz6 vz6Var12 = new vz6("![");
                            m70 m70Var5 = this.h;
                            m70 m70Var6 = new m70(vz6Var12, i33, m70Var5, this.g, true);
                            if (m70Var5 != null) {
                                m70Var5.g = true;
                            }
                            this.h = m70Var6;
                            a21Var3 = vz6Var12;
                            i2 = 0;
                            vz6Var = a21Var3;
                        } else {
                            vz6Var3 = new vz6("!");
                            a21Var3 = vz6Var3;
                            i2 = 0;
                            vz6Var = a21Var3;
                        }
                    }
                } else {
                    this.f++;
                    if (vz6Var7 instanceof vz6) {
                        vz6 vz6Var13 = vz6Var7;
                        if (vz6Var13.g.endsWith(" ")) {
                            String str11 = vz6Var13.g;
                            Matcher matcher = t.matcher(str11);
                            if (matcher.find()) {
                                i3 = matcher.end() - matcher.start();
                            } else {
                                i3 = 0;
                            }
                            if (i3 > 0) {
                                i2 = 0;
                                vz6Var13.g = str11.substring(0, str11.length() - i3);
                            } else {
                                i2 = 0;
                            }
                            if (i3 >= 2) {
                                a21Var2 = new a21();
                            } else {
                                a21Var2 = new a21();
                            }
                            vz6Var = a21Var2;
                        }
                    }
                    i2 = 0;
                    a21Var2 = new a21();
                    vz6Var = a21Var2;
                }
                if (vz6Var != null) {
                    vz6Var2 = vz6Var;
                    if (vz6Var2 == null) {
                        a21Var.b(vz6Var2);
                        i12 = i2;
                        vz6Var6 = null;
                        vz6Var7 = vz6Var2;
                    } else {
                        h(null);
                        a21 a21Var9 = (a21) a21Var.c;
                        a21 a21Var10 = (a21) a21Var.d;
                        if (a21Var9 == a21Var10) {
                            return;
                        }
                        e(a21Var9, a21Var10);
                        return;
                    }
                } else {
                    this.f++;
                    vz6Var6 = new vz6(String.valueOf(g));
                }
            }
            vz6Var2 = vz6Var6;
            if (vz6Var2 == null) {
            }
        }
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(mh1 mh1Var) {
        boolean z;
        a21 a21Var;
        HashMap hashMap = new HashMap();
        mh1 mh1Var2 = this.g;
        while (mh1Var2 != null) {
            mh1 mh1Var3 = mh1Var2.e;
            if (mh1Var3 == mh1Var) {
                break;
            }
            mh1Var2 = mh1Var3;
        }
        while (mh1Var2 != null) {
            vz6 vz6Var = mh1Var2.a;
            char c = mh1Var2.b;
            nh1 nh1Var = (nh1) this.c.get(Character.valueOf(c));
            if (mh1Var2.d && nh1Var != null) {
                char e = nh1Var.e();
                mh1 mh1Var4 = mh1Var2.e;
                int i2 = 0;
                boolean z2 = false;
                while (mh1Var4 != null && mh1Var4 != mh1Var && mh1Var4 != hashMap.get(Character.valueOf(c))) {
                    if (mh1Var4.c && mh1Var4.b == e) {
                        i2 = nh1Var.d(mh1Var4, mh1Var2);
                        z2 = true;
                        if (i2 > 0) {
                            z = true;
                            break;
                        }
                    }
                    mh1Var4 = mh1Var4.e;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), mh1Var2.e);
                        if (!mh1Var2.c) {
                            i(mh1Var2);
                        }
                    }
                    mh1Var2 = mh1Var2.f;
                } else {
                    vz6 vz6Var2 = mh1Var4.a;
                    mh1Var4.g -= i2;
                    mh1Var2.g -= i2;
                    String str = vz6Var2.g;
                    vz6Var2.g = str.substring(0, str.length() - i2);
                    String str2 = vz6Var.g;
                    vz6Var.g = str2.substring(0, str2.length() - i2);
                    mh1 mh1Var5 = mh1Var2.e;
                    while (mh1Var5 != null && mh1Var5 != mh1Var4) {
                        mh1 mh1Var6 = mh1Var5.e;
                        i(mh1Var5);
                        mh1Var5 = mh1Var6;
                    }
                    if (vz6Var2 != vz6Var && (a21Var = (a21) vz6Var2.f) != vz6Var) {
                        e(a21Var, (a21) vz6Var.e);
                    }
                    nh1Var.a(vz6Var2, vz6Var, i2);
                    if (mh1Var4.g == 0) {
                        mh1Var4.a.j();
                        i(mh1Var4);
                    }
                    if (mh1Var2.g == 0) {
                        mh1 mh1Var7 = mh1Var2.f;
                        vz6Var.j();
                        i(mh1Var2);
                        mh1Var2 = mh1Var7;
                    }
                }
            } else {
                mh1Var2 = mh1Var2.f;
            }
        }
        while (true) {
            mh1 mh1Var8 = this.g;
            if (mh1Var8 != null && mh1Var8 != mh1Var) {
                i(mh1Var8);
            } else {
                return;
            }
        }
    }

    public final void i(mh1 mh1Var) {
        mh1 mh1Var2 = mh1Var.e;
        if (mh1Var2 != null) {
            mh1Var2.f = mh1Var.f;
        }
        mh1 mh1Var3 = mh1Var.f;
        if (mh1Var3 == null) {
            this.g = mh1Var2;
        } else {
            mh1Var3.e = mh1Var2;
        }
    }
}
