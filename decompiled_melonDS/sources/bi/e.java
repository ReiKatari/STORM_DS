package bi;

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
import androidx.lifecycle.a1;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends androidx.fragment.app.j0 implements mb.c {

    /* renamed from: b0  reason: collision with root package name */
    public static final List f2279b0 = p7.t.y("com.google.android.documentsui", "com.android.documentsui");
    public kb.i A;
    public volatile kb.g L;
    public jb.c Y;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;
    public final a7.v Z = new a7.v(nc.u.a(i0.class), new d(this, 0), new d(this, 2), new d(this, 1));

    @Override // mb.b
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new kb.g(this);
                    }
                } finally {
                }
            }
        }
        return this.L.d();
    }

    @Override // androidx.fragment.app.j0
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.j0, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return k0.d.z(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new kb.i(super.getContext(), this);
            this.B = l0.f.r(super.getContext());
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Activity activity) {
        boolean z10;
        super.onAttach(activity);
        kb.i iVar = this.A;
        if (iVar != null && kb.g.c(iVar) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        aj.g.l(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (!this.X) {
            this.X = true;
            ((f) d()).getClass();
        }
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_no_directories, viewGroup, false);
        int i2 = R.id.buttonAction;
        Button button = (Button) k7.w.k(inflate, R.id.buttonAction);
        if (button != null) {
            i2 = R.id.textRomSearchDirectoryInfo;
            TextView textView = (TextView) k7.w.k(inflate, R.id.textRomSearchDirectoryInfo);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                this.Y = new jb.c(frameLayout, button, textView, 14);
                frameLayout.getClass();
                return frameLayout;
            }
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.j0
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new kb.i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.j0
    public final void onViewCreated(View view, Bundle bundle) {
        ApplicationInfo applicationInfo;
        view.getClass();
        PackageManager packageManager = requireActivity().getPackageManager();
        vd.a aVar = new vd.a(sd.f.READ_WRITE, 0);
        Context requireContext = requireContext();
        requireContext.getClass();
        if (packageManager.resolveActivity(aVar.d(requireContext, null), 65536) == null) {
            Iterator it = f2279b0.iterator();
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
            jb.c cVar = this.Y;
            if (applicationInfo != null) {
                if (cVar != null) {
                    ((TextView) cVar.L).setText(getString(R.string.system_file_picker_not_enabled));
                    jb.c cVar2 = this.Y;
                    if (cVar2 != null) {
                        Button button = (Button) cVar2.B;
                        button.setText(getString(R.string.file_picker_settings));
                        button.setVisibility(0);
                        button.setOnClickListener(new b(0, applicationInfo, this));
                        return;
                    }
                    nc.k.f("binding");
                    throw null;
                }
                nc.k.f("binding");
                throw null;
            } else if (cVar != null) {
                ((TextView) cVar.L).setText(getString(R.string.system_file_picker_not_found));
                jb.c cVar3 = this.Y;
                if (cVar3 != null) {
                    ((Button) cVar3.B).setVisibility(8);
                    return;
                } else {
                    nc.k.f("binding");
                    throw null;
                }
            } else {
                nc.k.f("binding");
                throw null;
            }
        }
        h.c registerForActivityResult = registerForActivityResult(aVar, new c(0, this));
        registerForActivityResult.getClass();
        jb.c cVar4 = this.Y;
        if (cVar4 != null) {
            ((TextView) cVar4.L).setText(getString(R.string.no_rom_search_directory_specified));
            jb.c cVar5 = this.Y;
            if (cVar5 != null) {
                Button button2 = (Button) cVar5.B;
                button2.setText(getString(R.string.set_rom_directory));
                button2.setVisibility(0);
                button2.setOnClickListener(new ah.f(1, registerForActivityResult));
                return;
            }
            nc.k.f("binding");
            throw null;
        }
        nc.k.f("binding");
        throw null;
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.X) {
            return;
        }
        this.X = true;
        ((f) d()).getClass();
    }
}
