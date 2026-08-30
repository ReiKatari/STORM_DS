package me.magnum.melonds.ui.romlist;

import a0.j;
import a4.n;
import a6.p0;
import a6.x0;
import a7.v;
import ah.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.s;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bi.b0;
import bi.c0;
import bi.i0;
import bi.y;
import bi.z;
import j7.p;
import java.util.WeakHashMap;
import k7.w;
import m9.o;
import mc.l;
import me.magnum.melonds.R;
import nc.k;
import nc.u;
import q8.r;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends bi.a {
    public n Y;
    public final v Z = new v(u.a(i0.class), new c0(this, 0), new c0(this, 2), new c0(this, 1));

    /* renamed from: b0  reason: collision with root package name */
    public y f9574b0;

    /* renamed from: c0  reason: collision with root package name */
    public l f9575c0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: me.magnum.melonds.ui.romlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class EnumC0005a {
        private static final /* synthetic */ fc.a $ENTRIES;
        private static final /* synthetic */ EnumC0005a[] $VALUES;
        public static final EnumC0005a ENABLE_ALL = new EnumC0005a("ENABLE_ALL", 0);
        public static final EnumC0005a ENABLE_NON_DSIWARE = new EnumC0005a("ENABLE_NON_DSIWARE", 1);

        private static final /* synthetic */ EnumC0005a[] $values() {
            return new EnumC0005a[]{ENABLE_ALL, ENABLE_NON_DSIWARE};
        }

        static {
            EnumC0005a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = r.x($values);
        }

        private EnumC0005a(String str, int i2) {
        }

        public static fc.a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0005a valueOf(String str) {
            return (EnumC0005a) Enum.valueOf(EnumC0005a.class, str);
        }

        public static EnumC0005a[] values() {
            return (EnumC0005a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.isEmpty() == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(me.magnum.melonds.ui.romlist.a r5) {
        /*
            a4.n r0 = r5.Y
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.L
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            boolean r0 = r0.L
            r3 = 0
            if (r0 != 0) goto L28
            bi.i0 r0 = r5.j()
            cd.y0 r0 = r0.f2297o
            cd.o1 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L28
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r0 != r4) goto L28
            goto L29
        L28:
            r4 = r3
        L29:
            a4.n r5 = r5.Y
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r5.R
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r4 == 0) goto L34
            goto L36
        L34:
            r3 = 8
        L36:
            r5.setVisibility(r3)
            return
        L3a:
            nc.k.f(r2)
            throw r1
        L3e:
            nc.k.f(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.romlist.a.i(me.magnum.melonds.ui.romlist.a):void");
    }

    public final i0 j() {
        return (i0) this.Z.getValue();
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.rom_list_fragment, viewGroup, false);
        int i2 = R.id.listRoms;
        RecyclerView recyclerView = (RecyclerView) w.k(inflate, R.id.listRoms);
        if (recyclerView != null) {
            i2 = R.id.swipeRefreshRoms;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) w.k(inflate, R.id.swipeRefreshRoms);
            if (swipeRefreshLayout != null) {
                i2 = R.id.textRomListEmpty;
                TextView textView = (TextView) w.k(inflate, R.id.textRomListEmpty);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.Y = new n(frameLayout, recyclerView, swipeRefreshLayout, textView, 23);
                    frameLayout.getClass();
                    return frameLayout;
                }
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.j0
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        EnumC0005a enumC0005a;
        j jVar;
        String string;
        view.getClass();
        n nVar = this.Y;
        if (nVar != null) {
            j jVar2 = new j(11);
            WeakHashMap weakHashMap = x0.f533a;
            p0.k((RecyclerView) nVar.B, jVar2);
            n nVar2 = this.Y;
            if (nVar2 != null) {
                ((SwipeRefreshLayout) nVar2.L).setOnRefreshListener(new e(1, this));
                Bundle arguments = getArguments();
                if (arguments != null) {
                    z10 = arguments.getBoolean("allow_rom_configuration");
                } else {
                    z10 = true;
                }
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string = arguments2.getString("rom_enable_criteria")) == null || (enumC0005a = EnumC0005a.valueOf(string)) == null) {
                    enumC0005a = EnumC0005a.ENABLE_ALL;
                }
                Context requireContext = requireContext();
                requireContext.getClass();
                s f8 = s0.f(this);
                z zVar = new z(this);
                int i2 = b.f9576a[enumC0005a.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        jVar = new j(13);
                    } else {
                        o.o();
                        return;
                    }
                } else {
                    jVar = new j(12);
                }
                this.f9574b0 = new y(this, z10, requireContext, f8, zVar, jVar);
                n nVar3 = this.Y;
                if (nVar3 != null) {
                    RecyclerView recyclerView = (RecyclerView) nVar3.B;
                    recyclerView.getContext();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.i(new p(recyclerView.getContext(), linearLayoutManager.f1605p));
                    y yVar = this.f9574b0;
                    if (yVar != null) {
                        recyclerView.setAdapter(yVar);
                        x.v(s0.f(this), null, null, new b0(this, null, 1), 3);
                        x.v(s0.f(this), null, null, new b0(this, null, 3), 3);
                        x.v(s0.f(this), null, null, new b0(this, null, 5), 3);
                        return;
                    }
                    k.f("romListAdapter");
                    throw null;
                }
                k.f("binding");
                throw null;
            }
            k.f("binding");
            throw null;
        }
        k.f("binding");
        throw null;
    }
}
