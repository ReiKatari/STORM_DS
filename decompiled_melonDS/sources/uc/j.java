package uc;

import a6.f0;
import java.util.Iterator;
import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13546a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13547b;

    /* renamed from: c  reason: collision with root package name */
    public final l f13548c;

    public /* synthetic */ j(f fVar, l lVar, int i2) {
        this.f13546a = i2;
        this.f13547b = fVar;
        this.f13548c = lVar;
    }

    @Override // uc.f
    public final Iterator iterator() {
        switch (this.f13546a) {
            case 0:
                return new jc.f(this);
            default:
                return new f0(this);
        }
    }
}
