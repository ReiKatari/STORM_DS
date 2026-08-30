package sj;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.a0;
import vj.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f12999i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f13000j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f13001k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f13002l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f13003n = Pattern.compile("^`+");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f13004o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f13005p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f13006q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f13007r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f13008s = Pattern.compile("\\s+");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f13009t = Pattern.compile(" *$");

    /* renamed from: a  reason: collision with root package name */
    public final BitSet f13010a;

    /* renamed from: b  reason: collision with root package name */
    public final BitSet f13011b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13012c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f13013d;

    /* renamed from: e  reason: collision with root package name */
    public String f13014e;

    /* renamed from: f  reason: collision with root package name */
    public int f13015f;

    /* renamed from: g  reason: collision with root package name */
    public e f13016g;

    /* renamed from: h  reason: collision with root package name */
    public d f13017h;

    public l(a0 a0Var) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new tj.a('*'), new tj.a('_')), hashMap);
        b((List) a0Var.B, hashMap);
        this.f13012c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f13011b = bitSet;
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
        this.f13010a = bitSet2;
        this.f13013d = a0Var;
    }

    public static void a(char c4, yj.a aVar, HashMap hashMap) {
        if (((yj.a) hashMap.put(Character.valueOf(c4), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c4 + "'");
    }

    public static void b(Iterable iterable, HashMap hashMap) {
        t tVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yj.a aVar = (yj.a) it.next();
            char e6 = aVar.e();
            char a10 = aVar.a();
            if (e6 == a10) {
                yj.a aVar2 = (yj.a) hashMap.get(Character.valueOf(e6));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
                    if (aVar2 instanceof t) {
                        tVar = (t) aVar2;
                    } else {
                        t tVar2 = new t(e6);
                        tVar2.f(aVar2);
                        tVar = tVar2;
                    }
                    tVar.f(aVar);
                    hashMap.put(Character.valueOf(e6), tVar);
                } else {
                    a(e6, aVar, hashMap);
                }
            } else {
                a(e6, aVar, hashMap);
                a(a10, aVar, hashMap);
            }
        }
    }

    public static void d(u uVar, u uVar2, int i2) {
        if (uVar != null && uVar2 != null && uVar != uVar2) {
            StringBuilder sb2 = new StringBuilder(i2);
            sb2.append(uVar.f13863g);
            v8.e eVar = (v8.e) uVar2.f13767f;
            for (v8.e eVar2 = (v8.e) uVar.f13767f; eVar2 != eVar; eVar2 = (v8.e) eVar2.f13767f) {
                sb2.append(((u) eVar2).f13863g);
                eVar2.j();
            }
            uVar.f13863g = sb2.toString();
        }
    }

    public static void e(v8.e eVar, v8.e eVar2) {
        u uVar = null;
        u uVar2 = null;
        int i2 = 0;
        while (eVar != null) {
            if (eVar instanceof u) {
                uVar2 = (u) eVar;
                if (uVar == null) {
                    uVar = uVar2;
                }
                i2 = uVar2.f13863g.length() + i2;
            } else {
                d(uVar, uVar2, i2);
                uVar = null;
                uVar2 = null;
                i2 = 0;
            }
            if (eVar == eVar2) {
                break;
            }
            eVar = (v8.e) eVar.f13767f;
        }
        d(uVar, uVar2, i2);
    }

    public final String c(Pattern pattern) {
        if (this.f13015f >= this.f13014e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f13014e);
        matcher.region(this.f13015f, this.f13014e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f13015f = matcher.end();
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
    /* JADX WARN: Type inference failed for: r4v17, types: [vj.d, v8.e] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [v8.e] */
    /* JADX WARN: Type inference failed for: r4v28, types: [vj.k, v8.e] */
    /* JADX WARN: Type inference failed for: r4v44, types: [vj.u] */
    /* JADX WARN: Type inference failed for: r4v45, types: [vj.u] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v22, types: [sj.k] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r26, v8.e r27) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.l.f(java.lang.String, v8.e):void");
    }

    public final char g() {
        if (this.f13015f < this.f13014e.length()) {
            return this.f13014e.charAt(this.f13015f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z10;
        v8.e eVar2;
        HashMap hashMap = new HashMap();
        e eVar3 = this.f13016g;
        while (eVar3 != null) {
            e eVar4 = eVar3.f12963e;
            if (eVar4 == eVar) {
                break;
            }
            eVar3 = eVar4;
        }
        while (eVar3 != null) {
            u uVar = eVar3.f12959a;
            char c4 = eVar3.f12960b;
            yj.a aVar = (yj.a) this.f13012c.get(Character.valueOf(c4));
            if (eVar3.f12962d && aVar != null) {
                char e6 = aVar.e();
                e eVar5 = eVar3.f12963e;
                int i2 = 0;
                boolean z11 = false;
                while (eVar5 != null && eVar5 != eVar && eVar5 != hashMap.get(Character.valueOf(c4))) {
                    if (eVar5.f12961c && eVar5.f12960b == e6) {
                        i2 = aVar.b(eVar5, eVar3);
                        z11 = true;
                        if (i2 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar5 = eVar5.f12963e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c4), eVar3.f12963e);
                        if (!eVar3.f12961c) {
                            i(eVar3);
                        }
                    }
                    eVar3 = eVar3.f12964f;
                } else {
                    u uVar2 = eVar5.f12959a;
                    eVar5.f12965g -= i2;
                    eVar3.f12965g -= i2;
                    String str = uVar2.f13863g;
                    uVar2.f13863g = str.substring(0, str.length() - i2);
                    String str2 = uVar.f13863g;
                    uVar.f13863g = str2.substring(0, str2.length() - i2);
                    e eVar6 = eVar3.f12963e;
                    while (eVar6 != null && eVar6 != eVar5) {
                        e eVar7 = eVar6.f12963e;
                        i(eVar6);
                        eVar6 = eVar7;
                    }
                    if (uVar2 != uVar && (eVar2 = (v8.e) uVar2.f13767f) != uVar) {
                        e(eVar2, (v8.e) uVar.f13766e);
                    }
                    aVar.d(uVar2, uVar, i2);
                    if (eVar5.f12965g == 0) {
                        eVar5.f12959a.j();
                        i(eVar5);
                    }
                    if (eVar3.f12965g == 0) {
                        e eVar8 = eVar3.f12964f;
                        uVar.j();
                        i(eVar3);
                        eVar3 = eVar8;
                    }
                }
            } else {
                eVar3 = eVar3.f12964f;
            }
        }
        while (true) {
            e eVar9 = this.f13016g;
            if (eVar9 != null && eVar9 != eVar) {
                i(eVar9);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f12963e;
        if (eVar2 != null) {
            eVar2.f12964f = eVar.f12964f;
        }
        e eVar3 = eVar.f12964f;
        if (eVar3 == null) {
            this.f13016g = eVar2;
        } else {
            eVar3.f12963e = eVar2;
        }
    }
}
