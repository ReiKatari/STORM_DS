package ah;

import android.os.Bundle;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j1 extends l.i implements mb.c {

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ int f792u0;

    /* renamed from: v0  reason: collision with root package name */
    public volatile kb.b f793v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Object f794w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f795x0;

    public j1(int i2) {
        this.f792u0 = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f794w0 = new Object();
                this.f795x0 = false;
                q(new i1((RomListActivity) this, 1));
                return;
            case 2:
                this.f794w0 = new Object();
                this.f795x0 = false;
                q(new i1((ShortcutSetupActivity) this, 4));
                return;
            case 3:
                this.f794w0 = new Object();
                this.f795x0 = false;
                q(new i1((LayoutEditorActivity) this, 8));
                return;
            default:
                this.f794w0 = new Object();
                this.f795x0 = false;
                q(new i1((EmulatorActivity) this, 0));
                return;
        }
    }

    @Override // mb.b
    public final Object d() {
        switch (this.f792u0) {
            case 0:
                return z().d();
            case DSiCameraSource.FrontCamera /* 1 */:
                return z().d();
            case 2:
                return z().d();
            default:
                return z().d();
        }
    }

    @Override // d.k, androidx.lifecycle.k
    public final androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        switch (this.f792u0) {
            case 0:
                return k0.d.w(this, super.getDefaultViewModelProviderFactory());
            case DSiCameraSource.FrontCamera /* 1 */:
                return k0.d.w(this, super.getDefaultViewModelProviderFactory());
            case 2:
                return k0.d.w(this, super.getDefaultViewModelProviderFactory());
            default:
                return k0.d.w(this, super.getDefaultViewModelProviderFactory());
        }
    }

    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.f792u0) {
            case 0:
                super.onCreate(bundle);
                z().c();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                super.onCreate(bundle);
                z().c();
                return;
            case 2:
                super.onCreate(bundle);
                z().c();
                return;
            default:
                super.onCreate(bundle);
                z().c();
                return;
        }
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        switch (this.f792u0) {
            case 0:
                super.onDestroy();
                z().a();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                super.onDestroy();
                z().a();
                return;
            case 2:
                super.onDestroy();
                z().a();
                return;
            default:
                super.onDestroy();
                z().a();
                return;
        }
    }

    public final kb.b z() {
        switch (this.f792u0) {
            case 0:
                if (this.f793v0 == null) {
                    synchronized (this.f794w0) {
                        try {
                            if (this.f793v0 == null) {
                                this.f793v0 = new kb.b(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.f793v0;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.f793v0 == null) {
                    synchronized (this.f794w0) {
                        try {
                            if (this.f793v0 == null) {
                                this.f793v0 = new kb.b(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.f793v0;
            case 2:
                if (this.f793v0 == null) {
                    synchronized (this.f794w0) {
                        try {
                            if (this.f793v0 == null) {
                                this.f793v0 = new kb.b(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.f793v0;
            default:
                if (this.f793v0 == null) {
                    synchronized (this.f794w0) {
                        try {
                            if (this.f793v0 == null) {
                                this.f793v0 = new kb.b(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.f793v0;
        }
    }
}
