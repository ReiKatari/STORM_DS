package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf4  reason: default package */
/* loaded from: classes.dex */
public final class wf4 extends o implements kr2 {
    public static final List d0 = hf.c0("com.google.android.documentsui", "com.android.documentsui");
    public bo7 A;
    public volatile mt L;
    public final d9 Z;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;
    public final uo7 Y = new uo7(gh5.a(tz5.class), new vf4(this, 0), new vf4(this, 2), new vf4(this, 1));

    public wf4() {
        d9 registerForActivityResult = registerForActivityResult(new zj1(sv4.READ_WRITE, 0), new k9(this, 2));
        registerForActivityResult.getClass();
        this.Z = registerForActivityResult;
    }

    @Override // defpackage.jr2
    public final Object c() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new mt(this);
                    }
                } finally {
                }
            }
        }
        return this.L.c();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.T(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new bo7(super.getContext(), this);
            this.B = bl2.I(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        bo7 bo7Var = this.A;
        if (bo7Var != null && mt.d(bo7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        qo2.o(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (!this.X) {
            this.X = true;
            ((yf4) c()).getClass();
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ApplicationInfo applicationInfo;
        boolean z;
        boolean z2;
        ApplicationInfo applicationInfo2;
        layoutInflater.getClass();
        PackageManager packageManager = requireActivity().getPackageManager();
        sv4 sv4Var = sv4.READ_WRITE;
        sv4Var.getClass();
        requireContext().getClass();
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(sv4Var.toFlags() | 192);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            Iterator it = d0.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        applicationInfo2 = requireActivity().getPackageManager().getApplicationInfo((String) it.next(), 0);
                        applicationInfo2.getClass();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!applicationInfo2.enabled) {
                        break;
                    }
                } else {
                    applicationInfo2 = null;
                    break;
                }
            }
            applicationInfo = applicationInfo2;
        } else {
            applicationInfo = null;
        }
        if (resolveActivity == null && applicationInfo == null) {
            z = true;
        } else {
            z = false;
        }
        if (applicationInfo != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(cs1.p0);
        composeView.setContent(new zv0(1355535377, true, new tf4(z2, z, this, applicationInfo, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new bo7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.X) {
            return;
        }
        this.X = true;
        ((yf4) c()).getClass();
    }
}
