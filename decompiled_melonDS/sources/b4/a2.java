package b4;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1785a;

    /* renamed from: b  reason: collision with root package name */
    public int f1786b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1787c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1788d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1789e;

    public a2(Context context, r rVar) {
        this.f1785a = 0;
        this.f1788d = rVar;
        this.f1786b = 0;
        this.f1789e = new GestureDetector(context, new z1(this));
    }

    public void a(int i2) {
        switch (this.f1785a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1789e;
                WeakReference weakReference = sideSheetBehavior.f3093p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1786b = i2;
                    if (!this.f1787c) {
                        ((View) sideSheetBehavior.f3093p.get()).postOnAnimation((a8.f) this.f1788d);
                        this.f1787c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1789e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1786b = i2;
                    if (!this.f1787c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((ad.g) this.f1788d);
                        this.f1787c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a2(BottomSheetBehavior bottomSheetBehavior) {
        this.f1785a = 2;
        this.f1789e = bottomSheetBehavior;
        this.f1788d = new ad.g(17, this);
    }

    public a2(SideSheetBehavior sideSheetBehavior) {
        this.f1785a = 1;
        this.f1789e = sideSheetBehavior;
        this.f1788d = new a8.f(24, this);
    }
}
