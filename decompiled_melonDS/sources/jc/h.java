package jc;

import a1.k0;
import a6.a1;
import d1.x1;
import java.util.Iterator;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.q2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements uc.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7804a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7805b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7806c;

    public h(CharSequence charSequence, p pVar) {
        this.f7804a = 4;
        charSequence.getClass();
        this.f7805b = charSequence;
        this.f7806c = pVar;
    }

    @Override // uc.f
    public final Iterator iterator() {
        switch (this.f7804a) {
            case 0:
                return new f(this);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new f(this, (byte) 0);
            case 2:
                return new f(this, (char) 0);
            case 3:
                return new k0(this);
            default:
                return new q2(this);
        }
    }

    public h(a1 a1Var, x1 x1Var) {
        this.f7804a = 2;
        uc.i iVar = uc.i.f13545b0;
        this.f7805b = a1Var;
        this.f7806c = x1Var;
    }

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.f7804a = i2;
        this.f7805b = obj;
        this.f7806c = obj2;
    }
}
