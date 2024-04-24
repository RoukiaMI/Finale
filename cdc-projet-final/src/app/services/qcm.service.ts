import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Qcm } from '../models/qcm';
import { MessageService } from './message.service';

@Injectable({ providedIn: 'root' })
export class QcmService {
  private qcmsUrl = 'http://localhost:8082/api/v0/'; // URL to web api

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
  };

  constructor(
    private http: HttpClient,
    private messageService: MessageService
  ) {}

  /** GET qcms from the server */
  getQcms(): Observable<Qcm[]> {
    return this.http.get<Qcm[]>(this.qcmsUrl + 'qcms').pipe(
      tap((_) => this.log('fetched qcms')),
      catchError(this.handleError<Qcm[]>('getQcms', []))
    );
  }

  /** GET qcm by id from the server */
  getQcmById(id: number): Observable<Qcm> {
    return this.http.get<Qcm>(this.qcmsUrl + 'qcms/' + id).pipe(
      tap((_) => this.log('fetched qcms')),
      catchError(this.handleError<Qcm>('getQcmById', undefined))
    );
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   *
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  /** Log a QcmService message with the MessageService */
  private log(message: string) {
    this.messageService.add(`QcmService: ${message}`);
  }
}

/*
Copyright Google LLC. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at https://angular.io/license
*/
