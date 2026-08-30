package sj;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d  reason: collision with root package name */
    public StringBuilder f13022d;

    /* renamed from: e  reason: collision with root package name */
    public String f13023e;

    /* renamed from: f  reason: collision with root package name */
    public String f13024f;

    /* renamed from: g  reason: collision with root package name */
    public char f13025g;

    /* renamed from: h  reason: collision with root package name */
    public StringBuilder f13026h;

    /* renamed from: a  reason: collision with root package name */
    public n f13019a = n.START_DEFINITION;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f13020b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13021c = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f13027i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [vj.n, java.lang.Object, v8.e] */
    public final void a() {
        String str;
        if (!this.f13027i) {
            return;
        }
        String a10 = uj.a.a(this.f13024f);
        StringBuilder sb2 = this.f13026h;
        if (sb2 != null) {
            str = uj.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13023e;
        ?? eVar = new v8.e();
        eVar.f13857g = str2;
        eVar.f13858h = a10;
        eVar.f13859i = str;
        this.f13021c.add(eVar);
        this.f13022d = null;
        this.f13027i = false;
        this.f13023e = null;
        this.f13024f = null;
        this.f13026h = null;
    }
}
