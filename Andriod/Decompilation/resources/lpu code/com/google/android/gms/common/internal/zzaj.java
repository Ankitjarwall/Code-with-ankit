package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.dynamic.zzf.zza;

public final class zzaj
  extends zzf<zzy>
{
  private static final zzaj zzaGI = new zzaj();
  
  private zzaj()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View zzd(Context paramContext, int paramInt1, int paramInt2)
    throws zzf.zza
  {
    return zzaGI.zze(paramContext, paramInt1, paramInt2);
  }
  
  private View zze(Context paramContext, int paramInt1, int paramInt2)
    throws zzf.zza
  {
    try
    {
      zzah localzzah = new zzah(paramInt1, paramInt2, null);
      IObjectWrapper localIObjectWrapper = zzd.zzA(paramContext);
      paramContext = (View)zzd.zzF(((zzy)zzbl(paramContext)).zza(localIObjectWrapper, localzzah));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new zzf.zza(64 + "Could not get button with size " + paramInt1 + " and color " + paramInt2, paramContext);
    }
  }
  
  public zzy zzby(IBinder paramIBinder)
  {
    return zzy.zza.zzbx(paramIBinder);
  }
}


/* Location:              C:\Users\ankit\Documents\GitHub\code-with-ankit\Andriod\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */