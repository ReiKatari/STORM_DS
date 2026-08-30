package sj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import vj.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: p  reason: collision with root package name */
    public static final LinkedHashSet f12969p = new LinkedHashSet(Arrays.asList(vj.b.class, vj.h.class, vj.f.class, vj.i.class, v.class, vj.o.class, vj.l.class));

    /* renamed from: q  reason: collision with root package name */
    public static final Map f12970q;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f12971a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12974d;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12978h;

    /* renamed from: i  reason: collision with root package name */
    public final List f12979i;

    /* renamed from: j  reason: collision with root package name */
    public final k0.g f12980j;

    /* renamed from: k  reason: collision with root package name */
    public final List f12981k;

    /* renamed from: l  reason: collision with root package name */
    public final f f12982l;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f12983n;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashSet f12984o;

    /* renamed from: b  reason: collision with root package name */
    public int f12972b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f12973c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f12975e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f12976f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f12977g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(vj.b.class, new b(0));
        hashMap.put(vj.h.class, new b(2));
        hashMap.put(vj.f.class, new b(1));
        hashMap.put(vj.i.class, new b(3));
        hashMap.put(v.class, new b(6));
        hashMap.put(vj.o.class, new b(5));
        hashMap.put(vj.l.class, new b(4));
        f12970q = Collections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, k0.g gVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f12983n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f12984o = linkedHashSet;
        this.f12979i = arrayList;
        this.f12980j = gVar;
        this.f12981k = arrayList2;
        f fVar = new f(0);
        this.f12982l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(xj.a aVar) {
        while (!h().b(aVar.d())) {
            e(h());
        }
        h().d().b(aVar.d());
        this.f12983n.add(aVar);
        this.f12984o.add(aVar);
    }

    public final void b(s sVar) {
        o oVar = sVar.f13037b;
        oVar.a();
        ArrayList arrayList = oVar.f13021c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            vj.n nVar = (vj.n) obj;
            vj.r rVar = sVar.f13036a;
            nVar.j();
            v8.e eVar = (v8.e) rVar.f13766e;
            nVar.f13766e = eVar;
            if (eVar != null) {
                eVar.f13767f = nVar;
            }
            nVar.f13767f = rVar;
            rVar.f13766e = nVar;
            v8.e eVar2 = (v8.e) rVar.f13763b;
            nVar.f13763b = eVar2;
            if (((v8.e) nVar.f13766e) == null) {
                eVar2.f13764c = nVar;
            }
            String str = nVar.f13857g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, nVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.f12974d) {
            CharSequence charSequence = this.f12971a;
            CharSequence subSequence2 = charSequence.subSequence(this.f12972b + 1, charSequence.length());
            int i2 = 4 - (this.f12973c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i2);
            for (int i10 = 0; i10 < i2; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f12971a;
            subSequence = charSequence2.subSequence(this.f12972b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.f12971a.charAt(this.f12972b);
        int i2 = this.f12972b;
        if (charAt == '\t') {
            this.f12972b = i2 + 1;
            int i10 = this.f12973c;
            this.f12973c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f12972b = i2 + 1;
        this.f12973c++;
    }

    public final void e(xj.a aVar) {
        if (h() == aVar) {
            ArrayList arrayList = this.f12983n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (aVar instanceof s) {
            b((s) aVar);
        }
        aVar.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((xj.a) list.get(size));
        }
    }

    public final void g() {
        int i2 = this.f12972b;
        int i10 = this.f12973c;
        this.f12978h = true;
        int length = this.f12971a.length();
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = this.f12971a.charAt(i2);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.f12978h = false;
                    break;
                } else {
                    i2++;
                    i10++;
                }
            } else {
                i2++;
                i10 += 4 - (i10 % 4);
            }
        }
        this.f12975e = i2;
        this.f12976f = i10;
        this.f12977g = i10 - this.f12973c;
    }

    public final xj.a h() {
        ArrayList arrayList = this.f12983n;
        return (xj.a) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ca, code lost:
        if (r3 < 1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cc, code lost:
        r3 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d2, code lost:
        if (r3 >= r12.length()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d4, code lost:
        r6 = r12.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01da, code lost:
        if (r6 == '\t') goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01de, code lost:
        if (r6 == ' ') goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e1, code lost:
        r6 = r12.subSequence(r8, r15).toString();
        r14 = new v8.e();
        r14.f13861h = java.lang.Integer.parseInt(r6);
        r14.f13862i = r5;
        r5 = new sj.p(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0495, code lost:
        if (r5.length() == 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05fb, code lost:
        k(r23.f12975e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0185, code lost:
        if (r5.length() == 0) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x051b  */
    /* JADX WARN: Type inference failed for: r14v17, types: [vj.q, vj.o, v8.e] */
    /* JADX WARN: Type inference failed for: r5v44, types: [vj.o, vj.c, v8.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.g.i(java.lang.String):void");
    }

    public final void j(int i2) {
        int i10;
        int i11 = this.f12976f;
        if (i2 >= i11) {
            this.f12972b = this.f12975e;
            this.f12973c = i11;
        }
        int length = this.f12971a.length();
        while (true) {
            i10 = this.f12973c;
            if (i10 >= i2 || this.f12972b == length) {
                break;
            }
            d();
        }
        if (i10 > i2) {
            this.f12972b--;
            this.f12973c = i2;
            this.f12974d = true;
            return;
        }
        this.f12974d = false;
    }

    public final void k(int i2) {
        int i10 = this.f12975e;
        if (i2 >= i10) {
            this.f12972b = i10;
            this.f12973c = this.f12976f;
        }
        int length = this.f12971a.length();
        while (true) {
            int i11 = this.f12972b;
            if (i11 >= i2 || i11 == length) {
                break;
            }
            d();
        }
        this.f12974d = false;
    }
}
