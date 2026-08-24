package me.magnum.melonds.ui.romlist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends tx2 {
    public l06 Y;
    public final uo7 Z = new uo7(gh5.a(tz5.class), new wy5(this, 0), new wy5(this, 2), new wy5(this, 1));
    public d00 d0;
    public qn2 e0;
    public pq5 f0;
    public final d9 g0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: me.magnum.melonds.ui.romlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class EnumC0004a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ EnumC0004a[] $VALUES;
        public static final EnumC0004a ENABLE_ALL = new EnumC0004a("ENABLE_ALL", 0);
        public static final EnumC0004a ENABLE_NON_DSIWARE = new EnumC0004a("ENABLE_NON_DSIWARE", 1);

        private static final /* synthetic */ EnumC0004a[] $values() {
            return new EnumC0004a[]{ENABLE_ALL, ENABLE_NON_DSIWARE};
        }

        static {
            EnumC0004a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private EnumC0004a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static EnumC0004a valueOf(String str) {
            return (EnumC0004a) Enum.valueOf(EnumC0004a.class, str);
        }

        public static EnumC0004a[] values() {
            return (EnumC0004a[]) $VALUES.clone();
        }
    }

    public a() {
        d9 registerForActivityResult = registerForActivityResult(new c9(1), new k9(this, 4));
        registerForActivityResult.getClass();
        this.g0 = registerForActivityResult;
    }

    public final tz5 j() {
        return (tz5) this.Z.getValue();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("allow_rom_configuration");
        } else {
            z = true;
        }
        this.d0 = new d00(this, 5);
        il4 b = requireActivity().b();
        d00 d00Var = this.d0;
        if (d00Var != null) {
            b.a(this, d00Var);
            Context requireContext = requireContext();
            requireContext.getClass();
            ComposeView composeView = new ComposeView(requireContext, null, 6);
            composeView.setViewCompositionStrategy(cs1.p0);
            composeView.setContent(new zv0(-834077021, true, new py5(this, z, 0)));
            return composeView;
        }
        nb3.a0("backPressedCallback");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        tz5 j = j();
        hv.L(to7.a(j), null, null, new pz5(j, null, 0), 3);
        j().p();
    }
}
