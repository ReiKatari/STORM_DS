package a7;

import androidx.constraintlayout.motion.widget.MotionLayout;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends d.w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f605d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, Object obj) {
        super(false);
        this.f605d = i2;
        this.f606e = obj;
    }

    @Override // d.w
    public void a() {
        switch (this.f605d) {
            case 3:
                ((b4.b) this.f606e).k();
                return;
            default:
                return;
        }
    }

    @Override // d.w
    public final void b() {
        switch (this.f605d) {
            case 0:
                ((d0) this.f606e).d();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.f606e;
                d5.f fVar = emulatorActivity.f9504y0;
                if (fVar != null) {
                    if (((MotionLayout) fVar.f3839a).getCurrentState() == R.id.rewind_visible) {
                        emulatorActivity.B();
                        return;
                    } else {
                        emulatorActivity.C().q(true);
                        return;
                    }
                }
                nc.k.f("binding");
                throw null;
            case 2:
                ((a5.b) this.f606e).k(this);
                return;
            case 3:
                ((b4.b) this.f606e).l();
                return;
            default:
                me.magnum.melonds.ui.layouteditor.b bVar = ((LayoutEditorActivity) this.f606e).C0;
                if (bVar != null) {
                    if (bVar.f9543d0) {
                        bVar.q(true);
                        return;
                    } else {
                        bVar.r();
                        return;
                    }
                }
                nc.k.f("layoutEditorManager");
                throw null;
        }
    }

    @Override // d.w
    public void c(d.a aVar) {
        switch (this.f605d) {
            case 3:
                ((b4.b) this.f606e).m(aVar);
                return;
            default:
                return;
        }
    }

    @Override // d.w
    public void d(d.a aVar) {
        switch (this.f605d) {
            case 3:
                ((b4.b) this.f606e).n();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, boolean z10, int i2) {
        super(true);
        this.f605d = i2;
        this.f606e = obj;
    }
}
