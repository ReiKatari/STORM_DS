package me.magnum.melonds.ui.romlist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class a extends sr2 {
    public rp5 Y;
    public final va7 Z = new va7(q75.a(yo5.class), new do5(this, 0), new do5(this, 2), new do5(this, 1));
    public my c0;
    public mi2 d0;
    public rg5 e0;
    public final c9 f0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: me.magnum.melonds.ui.romlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class EnumC0004a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ EnumC0004a[] $VALUES;
        public static final EnumC0004a ENABLE_ALL = new EnumC0004a("ENABLE_ALL", 0);
        public static final EnumC0004a ENABLE_NON_DSIWARE = new EnumC0004a("ENABLE_NON_DSIWARE", 1);

        private static final /* synthetic */ EnumC0004a[] $values() {
            return new EnumC0004a[]{ENABLE_ALL, ENABLE_NON_DSIWARE};
        }

        static {
            EnumC0004a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private EnumC0004a(String str, int i) {
        }

        public static e12 getEntries() {
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
        c9 registerForActivityResult = registerForActivityResult(new b9(0), new j9(4, this));
        registerForActivityResult.getClass();
        this.f0 = registerForActivityResult;
    }

    public final yo5 j() {
        return (yo5) this.Z.getValue();
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
        this.c0 = new my(5, this);
        kc4 b = requireActivity().b();
        my myVar = this.c0;
        if (myVar != null) {
            b.a(this, myVar);
            Context requireContext = requireContext();
            requireContext.getClass();
            ComposeView composeView = new ComposeView(requireContext, null, 6);
            composeView.setViewCompositionStrategy(y60.D0);
            composeView.setContent(new et0(-834077021, true, new zn5(this, z, 0)));
            return composeView;
        }
        b53.g0("backPressedCallback");
        throw null;
    }
}
