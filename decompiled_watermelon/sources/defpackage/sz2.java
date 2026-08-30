package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sz2  reason: default package */
/* loaded from: classes.dex */
public final class sz2 {
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
    public final k91 d;
    public String e;
    public int f;
    public kd1 g;
    public i50 h;

    public sz2(k91 k91Var) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new cv('*'), new cv('_')), hashMap);
        b((List) k91Var.A, hashMap);
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
        this.d = k91Var;
    }

    public static void a(char c, ld1 ld1Var, HashMap hashMap) {
        if (((ld1) hashMap.put(Character.valueOf(c), ld1Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(Iterable iterable, HashMap hashMap) {
        ed6 ed6Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ld1 ld1Var = (ld1) it.next();
            char e = ld1Var.e();
            char a = ld1Var.a();
            if (e == a) {
                ld1 ld1Var2 = (ld1) hashMap.get(Character.valueOf(e));
                if (ld1Var2 != null && ld1Var2.e() == ld1Var2.a()) {
                    if (ld1Var2 instanceof ed6) {
                        ed6Var = (ed6) ld1Var2;
                    } else {
                        ed6 ed6Var2 = new ed6(e);
                        ed6Var2.f(ld1Var2);
                        ed6Var = ed6Var2;
                    }
                    ed6Var.f(ld1Var);
                    hashMap.put(Character.valueOf(e), ed6Var);
                } else {
                    a(e, ld1Var, hashMap);
                }
            } else {
                a(e, ld1Var, hashMap);
                a(a, ld1Var, hashMap);
            }
        }
    }

    public static void d(jn6 jn6Var, jn6 jn6Var2, int i2) {
        if (jn6Var != null && jn6Var2 != null && jn6Var != jn6Var2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(jn6Var.g);
            vy0 vy0Var = (vy0) jn6Var2.f;
            for (vy0 vy0Var2 = (vy0) jn6Var.f; vy0Var2 != vy0Var; vy0Var2 = (vy0) vy0Var2.f) {
                sb.append(((jn6) vy0Var2).g);
                vy0Var2.j();
            }
            jn6Var.g = sb.toString();
        }
    }

    public static void e(vy0 vy0Var, vy0 vy0Var2) {
        jn6 jn6Var = null;
        jn6 jn6Var2 = null;
        int i2 = 0;
        while (vy0Var != null) {
            if (vy0Var instanceof jn6) {
                jn6Var2 = (jn6) vy0Var;
                if (jn6Var == null) {
                    jn6Var = jn6Var2;
                }
                i2 = jn6Var2.g.length() + i2;
            } else {
                d(jn6Var, jn6Var2, i2);
                jn6Var = null;
                jn6Var2 = null;
                i2 = 0;
            }
            if (vy0Var == vy0Var2) {
                break;
            }
            vy0Var = (vy0) vy0Var.f;
        }
        d(jn6Var, jn6Var2, i2);
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
    /* JADX WARN: Type inference failed for: r4v17, types: [up0, vy0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [vy0] */
    /* JADX WARN: Type inference failed for: r4v28, types: [iv2, vy0] */
    /* JADX WARN: Type inference failed for: r4v44, types: [jn6] */
    /* JADX WARN: Type inference failed for: r4v45, types: [jn6] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v22, types: [rz2] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r26, defpackage.vy0 r27) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.f(java.lang.String, vy0):void");
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(kd1 kd1Var) {
        boolean z;
        vy0 vy0Var;
        HashMap hashMap = new HashMap();
        kd1 kd1Var2 = this.g;
        while (kd1Var2 != null) {
            kd1 kd1Var3 = kd1Var2.e;
            if (kd1Var3 == kd1Var) {
                break;
            }
            kd1Var2 = kd1Var3;
        }
        while (kd1Var2 != null) {
            jn6 jn6Var = kd1Var2.a;
            char c = kd1Var2.b;
            ld1 ld1Var = (ld1) this.c.get(Character.valueOf(c));
            if (kd1Var2.d && ld1Var != null) {
                char e = ld1Var.e();
                kd1 kd1Var4 = kd1Var2.e;
                int i2 = 0;
                boolean z2 = false;
                while (kd1Var4 != null && kd1Var4 != kd1Var && kd1Var4 != hashMap.get(Character.valueOf(c))) {
                    if (kd1Var4.c && kd1Var4.b == e) {
                        i2 = ld1Var.c(kd1Var4, kd1Var2);
                        z2 = true;
                        if (i2 > 0) {
                            z = true;
                            break;
                        }
                    }
                    kd1Var4 = kd1Var4.e;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), kd1Var2.e);
                        if (!kd1Var2.c) {
                            i(kd1Var2);
                        }
                    }
                    kd1Var2 = kd1Var2.f;
                } else {
                    jn6 jn6Var2 = kd1Var4.a;
                    kd1Var4.g -= i2;
                    kd1Var2.g -= i2;
                    String str = jn6Var2.g;
                    jn6Var2.g = str.substring(0, str.length() - i2);
                    String str2 = jn6Var.g;
                    jn6Var.g = str2.substring(0, str2.length() - i2);
                    kd1 kd1Var5 = kd1Var2.e;
                    while (kd1Var5 != null && kd1Var5 != kd1Var4) {
                        kd1 kd1Var6 = kd1Var5.e;
                        i(kd1Var5);
                        kd1Var5 = kd1Var6;
                    }
                    if (jn6Var2 != jn6Var && (vy0Var = (vy0) jn6Var2.f) != jn6Var) {
                        e(vy0Var, (vy0) jn6Var.e);
                    }
                    ld1Var.d(jn6Var2, jn6Var, i2);
                    if (kd1Var4.g == 0) {
                        kd1Var4.a.j();
                        i(kd1Var4);
                    }
                    if (kd1Var2.g == 0) {
                        kd1 kd1Var7 = kd1Var2.f;
                        jn6Var.j();
                        i(kd1Var2);
                        kd1Var2 = kd1Var7;
                    }
                }
            } else {
                kd1Var2 = kd1Var2.f;
            }
        }
        while (true) {
            kd1 kd1Var8 = this.g;
            if (kd1Var8 != null && kd1Var8 != kd1Var) {
                i(kd1Var8);
            } else {
                return;
            }
        }
    }

    public final void i(kd1 kd1Var) {
        kd1 kd1Var2 = kd1Var.e;
        if (kd1Var2 != null) {
            kd1Var2.f = kd1Var.f;
        }
        kd1 kd1Var3 = kd1Var.f;
        if (kd1Var3 == null) {
            this.g = kd1Var2;
        } else {
            kd1Var3.e = kd1Var2;
        }
    }
}
