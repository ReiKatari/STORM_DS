package qa;

import com.google.android.material.internal.CheckableImageButton;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i2) {
        super(mVar);
        this.f12422e = i2;
    }

    @Override // qa.n
    public void q() {
        switch (this.f12422e) {
            case 0:
                m mVar = this.f12457b;
                mVar.f12449l0 = null;
                CheckableImageButton checkableImageButton = mVar.f12441d0;
                checkableImageButton.setOnLongClickListener(null);
                p7.m.E(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
