package lh;

import a7.l;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.picasso.a0;
import com.squareup.picasso.e0;
import j7.j1;
import j7.k0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import k7.w;
import l.i0;
import m9.o;
import me.magnum.melonds.R;
import oe.j0;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final a0 f9100d;

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDateFormat f9101e;

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDateFormat f9102f;

    /* renamed from: g  reason: collision with root package name */
    public final l f9103g;

    /* renamed from: h  reason: collision with root package name */
    public final l f9104h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f9105i;

    public d(List list, a0 a0Var, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, l lVar, l lVar2) {
        a0Var.getClass();
        this.f9100d = a0Var;
        this.f9101e = simpleDateFormat;
        this.f9102f = simpleDateFormat2;
        this.f9103g = lVar;
        this.f9104h = lVar2;
        this.f9105i = new ArrayList(list);
    }

    @Override // j7.k0
    public final int a() {
        return this.f9105i.size();
    }

    @Override // j7.k0
    public final long b(int i2) {
        return ((j0) this.f9105i.get(i2)).f10942a;
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        int i10;
        String valueOf;
        int i11;
        String valueOf2;
        final c cVar = (c) j1Var;
        final j0 j0Var = (j0) this.f9105i.get(i2);
        d dVar = cVar.f9099x;
        j0Var.getClass();
        int i12 = j0Var.f10942a;
        Date date = j0Var.f10944c;
        boolean z10 = j0Var.f10943b;
        x0 x0Var = cVar.f9096u;
        TextView textView = (TextView) x0Var.f14093f;
        TextView textView2 = (TextView) x0Var.f14092e;
        TextView textView3 = (TextView) x0Var.f14094g;
        Context context = ((ConstraintLayout) x0Var.f14089b).getContext();
        Uri uri = j0Var.f10945d;
        ImageView imageView = (ImageView) x0Var.f14091d;
        if (uri != null) {
            imageView.setVisibility(0);
            a0 a0Var = dVar.f9100d;
            a0Var.getClass();
            new e0(a0Var, uri).a(imageView, new i0(2, cVar));
        } else {
            imageView.setVisibility(8);
        }
        if (z10) {
            i10 = 0;
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            context.getClass();
            if (i12 == 0) {
                valueOf2 = context.getString(R.string.quick_slot);
                valueOf2.getClass();
            } else {
                valueOf2 = String.valueOf(i12);
            }
            textView.setText(context.getString(R.string.save_state_slot, valueOf2));
            SimpleDateFormat simpleDateFormat = dVar.f9101e;
            date.getClass();
            textView2.setText(simpleDateFormat.format(date));
            textView3.setText(dVar.f9102f.format(date));
        } else {
            i10 = 0;
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            context.getClass();
            if (i12 == 0) {
                valueOf = context.getString(R.string.quick_slot);
                valueOf.getClass();
            } else {
                valueOf = String.valueOf(i12);
            }
            textView.setText(context.getString(R.string.empty_slot, valueOf));
        }
        ((ConstraintLayout) x0Var.f14089b).setOnClickListener(new View.OnClickListener() { // from class: lh.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        cVar.f9097v.k(j0Var);
                        return;
                    default:
                        cVar.f9098w.k(j0Var);
                        return;
                }
            }
        });
        ImageView imageView2 = (ImageView) x0Var.f14090c;
        if (!z10) {
            i11 = 4;
        } else {
            i11 = i10;
        }
        imageView2.setVisibility(i11);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: lh.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        cVar.f9097v.k(j0Var);
                        return;
                    default:
                        cVar.f9098w.k(j0Var);
                        return;
                }
            }
        });
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_save_state_slot, viewGroup, false);
        int i10 = R.id.button_delete;
        ImageView imageView = (ImageView) w.k(inflate, R.id.button_delete);
        if (imageView != null) {
            i10 = R.id.image_screenshot;
            ImageView imageView2 = (ImageView) w.k(inflate, R.id.image_screenshot);
            if (imageView2 != null) {
                i10 = R.id.text_date;
                TextView textView = (TextView) w.k(inflate, R.id.text_date);
                if (textView != null) {
                    i10 = R.id.text_slot;
                    TextView textView2 = (TextView) w.k(inflate, R.id.text_slot);
                    if (textView2 != null) {
                        i10 = R.id.text_time;
                        TextView textView3 = (TextView) w.k(inflate, R.id.text_time);
                        if (textView3 != null) {
                            return new c(this, new x0((ConstraintLayout) inflate, imageView, imageView2, textView, textView2, textView3, 5), this.f9103g, this.f9104h);
                        }
                    }
                }
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
        return null;
    }
}
