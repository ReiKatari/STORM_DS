package jh;

import a4.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import j7.j1;
import j7.k0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import k7.w;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import wc.e;
import wc.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final a2.c f7903d;

    /* renamed from: e  reason: collision with root package name */
    public RewindWindow f7904e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f7905f;

    public c(a2.c cVar) {
        this.f7903d = cVar;
    }

    @Override // j7.k0
    public final int a() {
        ArrayList<RewindSaveState> rewindStates;
        RewindWindow rewindWindow = this.f7904e;
        if (rewindWindow != null && (rewindStates = rewindWindow.getRewindStates()) != null) {
            return rewindStates.size();
        }
        return 0;
    }

    @Override // j7.k0
    public final void d(RecyclerView recyclerView) {
        this.f7905f = recyclerView;
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        String string;
        b bVar = (b) j1Var;
        RewindWindow rewindWindow = this.f7904e;
        if (rewindWindow != null) {
            RewindSaveState rewindSaveState = rewindWindow.getRewindStates().get(i2);
            rewindSaveState.getClass();
            RewindSaveState rewindSaveState2 = rewindSaveState;
            Bitmap screenshot = rewindSaveState2.getScreenshot();
            Context context = bVar.f7900u;
            Resources resources = context.getResources();
            resources.getClass();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, screenshot);
            long m15getDeltaFromEmulationTimeToRewindState5sfh64U = rewindWindow.m15getDeltaFromEmulationTimeToRewindState5sfh64U(rewindSaveState2);
            n nVar = bVar.f7901v;
            ((ImageView) nVar.L).setImageDrawable(bitmapDrawable);
            TextView textView = (TextView) nVar.R;
            DecimalFormat decimalFormat = b.f7899x;
            l7.a aVar = wc.b.B;
            e eVar = e.MINUTES;
            int j2 = (int) wc.b.j(m15getDeltaFromEmulationTimeToRewindState5sfh64U, eVar);
            if (j2 >= 1) {
                string = context.getString(R.string.rewind_time_minutes_seconds, Integer.valueOf(j2), decimalFormat.format(Float.valueOf(((float) (wc.b.d(m15getDeltaFromEmulationTimeToRewindState5sfh64U) - wc.b.d(j.l(j2, eVar)))) / 1000.0f)));
                string.getClass();
            } else {
                string = context.getString(R.string.rewind_time_seconds, decimalFormat.format(Float.valueOf(((float) wc.b.d(m15getDeltaFromEmulationTimeToRewindState5sfh64U)) / 1000.0f)));
                string.getClass();
            }
            textView.setText(string);
            bVar.f7902w = rewindSaveState2;
        }
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rewind_save_state, viewGroup, false);
        int i10 = R.id.image_screenshot;
        ImageView imageView = (ImageView) w.k(inflate, R.id.image_screenshot);
        if (imageView != null) {
            i10 = R.id.text_timestamp;
            TextView textView = (TextView) w.k(inflate, R.id.text_timestamp);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                n nVar = new n(constraintLayout, imageView, textView, 22);
                Context context = viewGroup.getContext();
                context.getClass();
                b bVar = new b(context, nVar);
                constraintLayout.setOnClickListener(new bi.b(5, this, bVar));
                constraintLayout.setOnFocusChangeListener(new a(0, this));
                return bVar;
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
        return null;
    }
}
