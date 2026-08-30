package defpackage;

import android.os.Bundle;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rr2  reason: default package */
/* loaded from: classes.dex */
public abstract class rr2 extends xp implements el2 {
    public final /* synthetic */ int w0;
    public volatile q8 x0;
    public final Object y0;
    public boolean z0;

    public rr2(int i) {
        this.w0 = i;
        switch (i) {
            case 1:
                this.y0 = new Object();
                this.z0 = false;
                q(new wp((InputSetupActivity) this, 5));
                return;
            case 2:
                this.y0 = new Object();
                this.z0 = false;
                q(new wp((LayoutEditorActivity) this, 6));
                return;
            case 3:
                this.y0 = new Object();
                this.z0 = false;
                q(new wp((RomListActivity) this, 10));
                return;
            case 4:
                this.y0 = new Object();
                this.z0 = false;
                q(new wp((ShortcutSetupActivity) this, 12));
                return;
            default:
                this.y0 = new Object();
                this.z0 = false;
                q(new wp((EmulatorActivity) this, 4));
                return;
        }
    }

    private final q8 A() {
        if (this.x0 == null) {
            synchronized (this.y0) {
                try {
                    if (this.x0 == null) {
                        this.x0 = new q8(this);
                    }
                } finally {
                }
            }
        }
        return this.x0;
    }

    @Override // defpackage.dl2
    public final Object d() {
        switch (this.w0) {
            case 0:
                return z().d();
            case 1:
                return z().d();
            case 2:
                return z().d();
            case 3:
                return z().d();
            default:
                return z().d();
        }
    }

    @Override // defpackage.ys0, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        switch (this.w0) {
            case 0:
                return l07.K(this, super.getDefaultViewModelProviderFactory());
            case 1:
                return l07.K(this, super.getDefaultViewModelProviderFactory());
            case 2:
                return l07.K(this, super.getDefaultViewModelProviderFactory());
            case 3:
                return l07.K(this, super.getDefaultViewModelProviderFactory());
            default:
                return l07.K(this, super.getDefaultViewModelProviderFactory());
        }
    }

    @Override // androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.w0) {
            case 0:
                super.onCreate(bundle);
                z().c();
                return;
            case 1:
                super.onCreate(bundle);
                z().c();
                return;
            case 2:
                super.onCreate(bundle);
                z().c();
                return;
            case 3:
                super.onCreate(bundle);
                z().c();
                return;
            default:
                super.onCreate(bundle);
                z().c();
                return;
        }
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        switch (this.w0) {
            case 0:
                super.onDestroy();
                z().a();
                return;
            case 1:
                super.onDestroy();
                z().a();
                return;
            case 2:
                super.onDestroy();
                z().a();
                return;
            case 3:
                super.onDestroy();
                z().a();
                return;
            default:
                super.onDestroy();
                z().a();
                return;
        }
    }

    public final q8 z() {
        switch (this.w0) {
            case 0:
                if (this.x0 == null) {
                    synchronized (this.y0) {
                        try {
                            if (this.x0 == null) {
                                this.x0 = new q8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.x0;
            case 1:
                if (this.x0 == null) {
                    synchronized (this.y0) {
                        try {
                            if (this.x0 == null) {
                                this.x0 = new q8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.x0;
            case 2:
                if (this.x0 == null) {
                    synchronized (this.y0) {
                        try {
                            if (this.x0 == null) {
                                this.x0 = new q8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.x0;
            case 3:
                return A();
            default:
                if (this.x0 == null) {
                    synchronized (this.y0) {
                        try {
                            if (this.x0 == null) {
                                this.x0 = new q8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.x0;
        }
    }
}
