package defpackage;

import android.os.Bundle;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx2  reason: default package */
/* loaded from: classes.dex */
public abstract class sx2 extends jq implements kr2 {
    public boolean A0;
    public final /* synthetic */ int x0;
    public volatile r8 y0;
    public final Object z0;

    public sx2(int i) {
        this.x0 = i;
        switch (i) {
            case 1:
                this.z0 = new Object();
                this.A0 = false;
                q(new iq((InputSetupActivity) this, 5));
                return;
            case 2:
                this.z0 = new Object();
                this.A0 = false;
                q(new iq((LayoutEditorActivity) this, 6));
                return;
            case 3:
                this.z0 = new Object();
                this.A0 = false;
                q(new iq((RomListActivity) this, 10));
                return;
            case 4:
                this.z0 = new Object();
                this.A0 = false;
                q(new iq((ShortcutSetupActivity) this, 12));
                return;
            default:
                this.z0 = new Object();
                this.A0 = false;
                q(new iq((EmulatorActivity) this, 4));
                return;
        }
    }

    private final r8 A() {
        if (this.y0 == null) {
            synchronized (this.z0) {
                try {
                    if (this.y0 == null) {
                        this.y0 = new r8(this);
                    }
                } finally {
                }
            }
        }
        return this.y0;
    }

    @Override // defpackage.jr2
    public final Object c() {
        switch (this.x0) {
            case 0:
                return z().c();
            case 1:
                return z().c();
            case 2:
                return z().c();
            case 3:
                return z().c();
            default:
                return z().c();
        }
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        switch (this.x0) {
            case 0:
                return hf.R(this, super.getDefaultViewModelProviderFactory());
            case 1:
                return hf.R(this, super.getDefaultViewModelProviderFactory());
            case 2:
                return hf.R(this, super.getDefaultViewModelProviderFactory());
            case 3:
                return hf.R(this, super.getDefaultViewModelProviderFactory());
            default:
                return hf.R(this, super.getDefaultViewModelProviderFactory());
        }
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.x0) {
            case 0:
                super.onCreate(bundle);
                z().d();
                return;
            case 1:
                super.onCreate(bundle);
                z().d();
                return;
            case 2:
                super.onCreate(bundle);
                z().d();
                return;
            case 3:
                super.onCreate(bundle);
                z().d();
                return;
            default:
                super.onCreate(bundle);
                z().d();
                return;
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        switch (this.x0) {
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

    public final r8 z() {
        switch (this.x0) {
            case 0:
                if (this.y0 == null) {
                    synchronized (this.z0) {
                        try {
                            if (this.y0 == null) {
                                this.y0 = new r8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.y0;
            case 1:
                if (this.y0 == null) {
                    synchronized (this.z0) {
                        try {
                            if (this.y0 == null) {
                                this.y0 = new r8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.y0;
            case 2:
                if (this.y0 == null) {
                    synchronized (this.z0) {
                        try {
                            if (this.y0 == null) {
                                this.y0 = new r8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.y0;
            case 3:
                return A();
            default:
                if (this.y0 == null) {
                    synchronized (this.z0) {
                        try {
                            if (this.y0 == null) {
                                this.y0 = new r8(this);
                            }
                        } finally {
                        }
                    }
                }
                return this.y0;
        }
    }
}
