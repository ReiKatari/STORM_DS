package k7;

import ah.m1;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final nc.e f8055a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8056b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8057c;

    /* renamed from: f  reason: collision with root package name */
    public Executor f8060f;

    /* renamed from: g  reason: collision with root package name */
    public Executor f8061g;

    /* renamed from: h  reason: collision with root package name */
    public ah.e f8062h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8063i;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8070q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8071r;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8058d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8059e = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final s f8064j = s.AUTOMATIC;

    /* renamed from: k  reason: collision with root package name */
    public final long f8065k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final m1 f8066l = new m1(2, (byte) 0);
    public final LinkedHashSet m = new LinkedHashSet();

    /* renamed from: n  reason: collision with root package name */
    public final LinkedHashSet f8067n = new LinkedHashSet();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f8068o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public boolean f8069p = true;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8072s = true;

    public q(Context context, Class cls, String str) {
        this.f8055a = nc.u.a(cls);
        this.f8056b = context;
        this.f8057c = str;
    }

    public final void a(n7.a... aVarArr) {
        for (n7.a aVar : aVarArr) {
            Integer valueOf = Integer.valueOf(aVar.f10095a);
            LinkedHashSet linkedHashSet = this.f8067n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f10096b));
        }
        n7.a[] aVarArr2 = (n7.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        m1 m1Var = this.f8066l;
        m1Var.getClass();
        for (n7.a aVar2 : aVarArr2) {
            m1Var.c(aVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ce, code lost:
        a0.j.h("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k7.t b() {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q.b():k7.t");
    }
}
