package q8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kf.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: i  reason: collision with root package name */
    public static final String f12358i = p8.v.g("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    public final p f12359a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12360b;

    /* renamed from: c  reason: collision with root package name */
    public final p8.l f12361c;

    /* renamed from: d  reason: collision with root package name */
    public final List f12362d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12363e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f12364f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f12365g;

    /* renamed from: h  reason: collision with root package name */
    public p8.x f12366h;

    public m(p pVar, String str, p8.l lVar, List list) {
        this.f12359a = pVar;
        this.f12360b = str;
        this.f12361c = lVar;
        this.f12362d = list;
        this.f12363e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (lVar == p8.l.REPLACE && ((p8.y) list.get(i2)).f11514b.f14439u != Long.MAX_VALUE) {
                a0.j.h("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((p8.y) list.get(i2)).f11513a.toString();
            uuid.getClass();
            this.f12363e.add(uuid);
            this.f12364f.add(uuid);
        }
    }

    public static HashSet b(m mVar) {
        HashSet hashSet = new HashSet();
        mVar.getClass();
        return hashSet;
    }

    public final p8.x a() {
        if (!this.f12365g) {
            p pVar = this.f12359a;
            p8.x xVar = pVar.f12372b.m;
            this.f12366h = p7.m.A(xVar, "EnqueueRunnable_" + this.f12361c.name(), pVar.f12374d.f14969a, new s0(8, this));
        } else {
            p8.v e6 = p8.v.e();
            e6.h(f12358i, "Already enqueued work ids (" + TextUtils.join(", ", this.f12363e) + ")");
        }
        return this.f12366h;
    }
}
