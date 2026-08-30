package m6;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends k7.w {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f9270j;

    public e(f fVar) {
        this.f9270j = fVar;
    }

    @Override // k7.w
    public final void x(Throwable th2) {
        this.f9270j.f9271a.f(th2);
    }

    @Override // k7.w
    public final void y(b9.e eVar) {
        Set<int[]> o5;
        f fVar = this.f9270j;
        fVar.f9273c = eVar;
        b9.e eVar2 = fVar.f9273c;
        i iVar = fVar.f9271a;
        l7.a aVar = iVar.f9282g;
        d dVar = iVar.f9284i;
        if (Build.VERSION.SDK_INT >= 34) {
            o5 = l.a();
        } else {
            o5 = l0.f.o();
        }
        fVar.f9272b = new a4.n(eVar2, aVar, dVar, o5);
        i iVar2 = fVar.f9271a;
        ArrayList arrayList = new ArrayList();
        iVar2.f9276a.writeLock().lock();
        try {
            iVar2.f9278c = 1;
            arrayList.addAll(iVar2.f9277b);
            iVar2.f9277b.clear();
            iVar2.f9276a.writeLock().unlock();
            iVar2.f9279d.post(new com.google.android.material.datepicker.g(arrayList, iVar2.f9278c, (Throwable) null));
        } catch (Throwable th2) {
            iVar2.f9276a.writeLock().unlock();
            throw th2;
        }
    }
}
