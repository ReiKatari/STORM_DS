package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import java.util.Iterator;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f74  reason: default package */
/* loaded from: classes.dex */
public final class f74 extends o implements el2 {
    public static final List c0 = l07.c0("com.google.android.documentsui", "com.android.documentsui");
    public ba7 A;
    public volatile ws L;
    public k91 Y;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;
    public final va7 Z = new va7(q75.a(yo5.class), new e74(this, 0), new e74(this, 2), new e74(this, 1));

    @Override // defpackage.dl2
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new ws(this);
                    }
                } finally {
                }
            }
        }
        return this.L.d();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.o, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.N(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new ba7(super.getContext(), this);
            this.B = cg2.K(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ba7 ba7Var = this.A;
        if (ba7Var != null && ws.c(ba7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        jk2.n(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (!this.X) {
            this.X = true;
            ((g74) d()).getClass();
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_no_directories, viewGroup, false);
        int i = R.id.buttonAction;
        Button button = (Button) ep2.r(inflate, R.id.buttonAction);
        if (button != null) {
            i = R.id.textRomSearchDirectoryInfo;
            TextView textView = (TextView) ep2.r(inflate, R.id.textRomSearchDirectoryInfo);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                this.Y = new k91(frameLayout, button, textView);
                frameLayout.getClass();
                return frameLayout;
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ba7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        ApplicationInfo applicationInfo;
        view.getClass();
        PackageManager packageManager = requireActivity().getPackageManager();
        vf1 vf1Var = new vf1(nm4.READ_WRITE, 0);
        Context requireContext = requireContext();
        requireContext.getClass();
        if (packageManager.resolveActivity(vf1Var.d(requireContext, null), 65536) == null) {
            Iterator it = c0.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        applicationInfo = requireActivity().getPackageManager().getApplicationInfo((String) it.next(), 0);
                        applicationInfo.getClass();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!applicationInfo.enabled) {
                        break;
                    }
                } else {
                    applicationInfo = null;
                    break;
                }
            }
            k91 k91Var = this.Y;
            if (applicationInfo != null) {
                if (k91Var != null) {
                    ((TextView) k91Var.B).setText(getString(R.string.system_file_picker_not_enabled));
                    k91 k91Var2 = this.Y;
                    if (k91Var2 != null) {
                        Button button = (Button) k91Var2.A;
                        button.setText(getString(R.string.file_picker_settings));
                        button.setVisibility(0);
                        button.setOnClickListener(new b82(2, applicationInfo, this));
                        return;
                    }
                    b53.g0("binding");
                    throw null;
                }
                b53.g0("binding");
                throw null;
            } else if (k91Var != null) {
                ((TextView) k91Var.B).setText(getString(R.string.system_file_picker_not_found));
                k91 k91Var3 = this.Y;
                if (k91Var3 != null) {
                    ((Button) k91Var3.A).setVisibility(8);
                    return;
                } else {
                    b53.g0("binding");
                    throw null;
                }
            } else {
                b53.g0("binding");
                throw null;
            }
        }
        c9 registerForActivityResult = registerForActivityResult(vf1Var, new j9(2, this));
        registerForActivityResult.getClass();
        k91 k91Var4 = this.Y;
        if (k91Var4 != null) {
            ((TextView) k91Var4.B).setText(getString(R.string.no_rom_search_directory_specified));
            k91 k91Var5 = this.Y;
            if (k91Var5 != null) {
                Button button2 = (Button) k91Var5.A;
                button2.setText(getString(R.string.set_rom_directory));
                button2.setVisibility(0);
                button2.setOnClickListener(new xo0(4, registerForActivityResult));
                return;
            }
            b53.g0("binding");
            throw null;
        }
        b53.g0("binding");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.X) {
            return;
        }
        this.X = true;
        ((g74) d()).getClass();
    }
}
